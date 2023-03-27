package com.ani.poton.domain.pot.entity;


import com.ani.poton.domain.member.entity.Member;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Pot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POT_ID", nullable = false)
    private Long id;
    private Long growthRate;
    private String name;
    private int countOfWater;

    @ManyToOne
    private Member owner;

    @Builder
    public Pot(Long id, String name, Member owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }
}
