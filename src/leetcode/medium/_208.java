package leetcode.medium;

import java.util.HashSet;
import java.util.Iterator;

public class _208 {
    class Trie {

        HashSet<String> set;

        public Trie() {
            set = new HashSet<>();
        }

        public void insert(String word) {
            set.add(word);
        }

        public boolean search(String word) {
            return set.contains(word);
        }

        public boolean startsWith(String prefix) {
            Iterator iter = set.iterator();	// Iterator 사용
            while(iter.hasNext()) {//값이 있으면 true 없으면 false
                if(((String)iter.next()).startsWith(prefix)) return true;
            }
            return false;
        }
    }

}
