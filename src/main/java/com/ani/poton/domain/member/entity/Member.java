package com.ani.poton.domain.member.entity;

import com.ani.poton.domain.member.entity.member_type.MemberExperience;
import com.ani.poton.domain.pot.entity.Pot;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Member {

    @Id
    private Long id;
    @Column(unique = true)
    private String name;
    private String password;
    private boolean attendance = false;
    private int coin;
    private MemberExperience experience;

    @OneToMany
    @JoinColumn(name = "POT_ID")
    private List<Pot> pots;

    @Builder
    public Member(String name, String password) {
        this.name = name;
        this.password = password;
        experience = MemberExperience.BEGINNER;
    }
}
