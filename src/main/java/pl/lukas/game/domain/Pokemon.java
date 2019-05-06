package pl.lukas.game.domain;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    private String name;
    private int hitPoints;
    private int level;
    private int damage;
    private int energy;
    private int defense;
    private String photo;
    private long experience;
}
