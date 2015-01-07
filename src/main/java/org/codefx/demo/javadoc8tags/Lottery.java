package org.codefx.demo.javadoc8tags;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * The lottery.
 * <p>
 * "Here's something to think about: How come you never see a headline like 'Psychic Wins Lottery'?" (Jay Leno)
 *
 * @since 1.0
 */
public interface Lottery {

	/**
	 * Picks the winners from the specified set of players.
	 * <p>
	 * The returned list defines the order of the winners, where the first prize goes to the player at position 0. The
	 * list will not be null but can be empty.
	 *
	 * @apiNote This method was added after the interface was released in version 1.0. It is defined as a default method
	 *          for compatibility reasons. From version 2.0 on, the method will be abstract and all implementations of
	 *          this interface have to provide their own implementation of the method.
	 * @implSpec The default implementation will consider each player a winner and return them in an unspecified order.
	 * @implNote This implementation has linear runtime and does not filter out null players.
	 * @param players
	 *            the players from which the winners will be selected
	 * @return the (ordered) list of the players who won; the list will not contain duplicates
	 * @since 1.1
	 */
	default List<String> pickWinners(Set<String> players) {
		return new ArrayList<>(players);
	}

}
