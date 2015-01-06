package org.codefx.demo.javadoc8tags;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;

/**
 * The state lottery.
 * <p>
 * It implements {@link #pickWinners(Set) pickWinners} and provides a Javadoc block which only consists of
 * {@code @inhheritDoc}. The comment is copied from the interface method but without the new tags.
 */
public class StateLottery implements Lottery {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<String> pickWinners(Set<String> players) {
		if (players.isEmpty()) {
			return new ArrayList<>();
		}

		String winner = players.stream()
				.findAny() // "No fair!"
				.orElseThrow(ConcurrentModificationException::new);
		return Collections.singletonList(winner);
	}

}
