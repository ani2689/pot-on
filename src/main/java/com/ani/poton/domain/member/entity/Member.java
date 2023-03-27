package com.ani.poton.domain.member.entity;

import com.ani.poton.domain.pot.entity.Pot;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
public class Member {

    @Id
    private Long id;
    private String name;
    private boolean attendance = false;
    private int coin;

    @OneToMany
    @JoinColumn(name = "POT_ID")
    private List<Pot> pots;

    @Builder
    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
