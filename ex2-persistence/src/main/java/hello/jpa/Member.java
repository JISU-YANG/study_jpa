package hello.jpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "name", updatable = true, insertable = true, nullable = false, unique = true, length = 255)
    private String username;

    private Integer age;

//    @Enumerated(EnumType.ORDINAL) // 순서 (주의해야한다.)
    @Enumerated(EnumType.STRING) // 문자열
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

//    년월일
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDate testLocalDate;

//    년월일 + 시간
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime testLocalDateTime;

    @Lob
    private String description;



    public Member() {
    }

//    public Member(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
