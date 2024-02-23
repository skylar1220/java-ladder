import domain.*;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {

    @Test
    @DisplayName("높이와 참가자수, 번호생성기가 주어지면 높이만큼 사다리를 생성한다.")
    void makeLadder() {
        // given
        final Ladder ladder = Ladder.create(new Height(4), PlayerCount.fromPlayers(Players.from(List.of("a", "b", "c"))));

        // when & then
        assertThat(ladder).extracting("lines")
                .asList()
                .hasSize(4);
    }
}
