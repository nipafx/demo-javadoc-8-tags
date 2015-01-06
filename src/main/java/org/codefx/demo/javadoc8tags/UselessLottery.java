package org.codefx.demo.javadoc8tags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * They clearly have no idea <i>what</i> they're doing!
 * <p>
 * This class implements {@link #pickWinners(Set) pickWinners} and provides a Javadoc block which inherits docs from
 * some of the new tags as well (in a senseless and random way).
 */
public class UselessLottery implements Lottery {

	/**
	 * {@inheritDoc} Let "Q" names win!
	 *
	 * @apiNote {@inheritDoc}
	 * @implNote {@inheritDoc}
	 */
	@Override
	public List<String> pickWinners(Set<String> players) {
		String[] temp = new String[players.size()];
		AtomicInteger i = new AtomicInteger(0);
		// TODO Auto-generated method stub
		try {
			// streamz are kewl
			players.stream().filter(p -> p.startsWith("Q")).forEach(q -> {
				temp[i.getAndAdd(1)] = q;
			});
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
		}
		int j = (int) Math.floor(Math.random() * i.get());
		ArrayList<String> t = new ArrayList<String>();
		Arrays.stream(temp).forEach(p -> {
			if (p != null) {
				t.add(p);
			}
		});
		return t;
	}

}
