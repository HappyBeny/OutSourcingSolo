package practice.outsourcingsingle.common.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import practice.outsourcingsingle.common.domain.enums.UserRole;
import practice.outsourcingsingle.common.exception.ErrorCode;
import practice.outsourcingsingle.common.exception.base.InvalidRequestException;

//Todo : 생성자, 메서드 정리
// 테스트코드용 메서드??, 세터 사용 많음, 메튜 풋/크리에이트 차이?
@Entity
@Table(name = "menu")
@Getter
public class Menu extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    private Boolean isDeleted = Boolean.FALSE;

    private Menu(String name, Integer price, Store store, User user) {
        this.name = name;
        this.price = price;
        this.store = store;
        this.user = user;
    }

    private Menu(Long id, String name, Integer price, Store store, User user, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
        this.user = user;
        this.isDeleted = isDeleted;
    }

    private Menu(Long id, String name, Integer price, Store store, User user) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
        this.user = user;
    }

    public Menu(){
    }

    public static Menu menuCreate(String name, Integer price, Store store, User user) {
        return new Menu(name, price, store, user);
    }

    public static Menu menuPut(Long id, String name, Integer price, Store store, User user) {
        return new Menu(id, name, price, store, user);
    }

    public static Menu menuCreateWithTestCode(Long id,String name,Integer price,Store store,User user,boolean isDeleted) {
        return new Menu(id,name,price,store,user,isDeleted);
    }

    public static void ownerCheck(User user) {
        if (!(user.getUserRole() == UserRole.OWNER || user.isDeleted())) {
            throw new InvalidRequestException(ErrorCode.MENU_BAD_REQUEST);
        }
    }

    public static void storeCheck(User user,Store store) {
        if (!(store.getUser() == user || user.isDeleted())) {
            throw new InvalidRequestException(ErrorCode.MENU_BAD_REQUEST);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
