package pl.lukas.game.domain;

import lombok.*;
import pl.lukas.game.places.ItemInventory;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Player {

    private String photo;
    private String nick;
    private Pokemon pokemon;
    List<ItemInventory> itemInventory;
    private long money;
}
