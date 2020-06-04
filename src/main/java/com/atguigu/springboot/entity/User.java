package com.atguigu.springboot.entity;


import javax.persistence.*;

// 使用jpa注解配置映射关系
@Entity // 告诉jpa这是一个实体类（和数据库表映射的类）
// @Table指定和那个数据表对应，，数据库没有可以自动创建,,如果省略name属性，表明就是默认的类名小写，也就是user
@Table(name = "tbl_user")
public class User {

    @Id // 这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    private Integer id;

    @Column(name = "last_name",length = 50) // @Column：这是和数据库对应的列，name指的是列名，length指的是数据长度
    private String lastName;

    @Column //默认就是属性名
    private String email;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
