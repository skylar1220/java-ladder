package domain;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Players {
    private final List<Player> players;

    private Players(final List<Player> players) {
        validate(players);
        this.players = players;
    }

    public static Players from(List<String> players) {
        return new Players(convertToPlayer(players));
    }

    private static List<Player> convertToPlayer(List<String> players) {
        return players.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }

    public Players search(String name) {    // TODO: 방식 개선
        if (name.equals("all")) {
            return this;
        }
        validateExist(name);
        return players.stream()
                .filter(player -> player.isSameName(name))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Players::new));
    }

    private void validateExist(String name) {
        players.stream()
                .filter(player -> player.isSameName(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("참여자 중에서만 입력할 수 있습니다."));
    }

    public Player findByIndex(int index) {  // TODO: 이렇게 갖고오는 게 디미터의 법칙 위반은 아닐까?
        return players.get(index);
    }

    public boolean isCountMoreThan(int index) {
        return players.size() > index;
    }

    public boolean isCountOne() {
        return players.size() == 1;
    }

    public int getCount() {  // TODO: 이렇게 갖고오는 게 디미터의 법칙 위반은 아닐까?
        return players.size();
    }

    private void validate(List<Player> players) {
        if (hasDuplicate(players)) {
            throw new IllegalArgumentException("중복된 참가자를 입력할 수 없습니다.");
        }
    }

    private boolean hasDuplicate(List<Player> players) {
        return Set.copyOf(players).size() != players.size();
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }
}
