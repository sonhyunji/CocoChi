package com.coco.cocochi.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {

    @Id
    private String userEmail;
    private String userPassword;
    private String userName;

}
