package telran.collection.test;

import org.junit.jupiter.api.BeforeEach;

import telran.collection.Collection;
import telran.collection.LinkedList;

public class LikedHashSetTest extends ListTest {
	@Override
	@BeforeEach
	void setUp() {
		collection = new LinkedList<Integer>();
		super.setUp();
	}
	@Override
	protected Collection<Integer> getCollection(Integer[] ar) {
		LinkedList<Integer> res = new LinkedList<>();
		for(Integer num: ar) {
			res.add(num);
		}
		return res;
	}

}