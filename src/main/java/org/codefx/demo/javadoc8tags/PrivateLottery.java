package org.codefx.demo.javadoc8tags;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * A private lottery.
 * <p>
 * It implements {@link #pickWinners(Set) pickWinners} but provides no own Javadoc block. The interface method's comment
 * is referenced but without the new tags.
 */
public class PrivateLottery implements Lottery {

	@Override
	public List<String> pickWinners(Set<String> players) {
		return new ArrayList<>(); // HarHar
	}

}
