package telran.collection;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap<K, V> extends AbstractMap<K, V> {
	public LinkedHashMap() {
		set = new LinkedHashSet<>();
	}


	@Override
	protected telran.collection.Set<K> getEmptyKeySet() {
		return new LinkedHashSet<>();
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}