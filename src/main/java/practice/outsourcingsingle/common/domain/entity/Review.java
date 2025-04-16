package practice.outsourcingsingle.common.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import practice.outsourcingsingle.common.domain.enums.ReviewStar;

@Table(name = "review")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ReviewStar reviewStar;

    @Column(nullable = false)
    private String content;

    public Review(Order order, ReviewStar reviewStar, String content) {
        this.order = order;
        this.reviewStar = reviewStar;
        this.content = content;
    }

    public void changeReview(ReviewStar reviewStar, String content) {
        this.reviewStar = reviewStar;
        this.content = content;
    }
}
