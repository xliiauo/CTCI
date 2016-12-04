import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class IsUnique {
  public static void main(String[] args) {
    System.out.println(new IsUnique().isUniqueHashSet("asdfasdfasd"));
    System.out.println(new IsUnique().isUniqueHashSet("abc"));
    System.out.println(new IsUnique().isUniqueHash("asdfasdfasd"));
    System.out.println(new IsUnique().isUniqueHash("abc"));
    System.out.println(new IsUnique().isUnique("asdfasdfasd"));
    System.out.println(new IsUnique().isUnique("abc"));
  }

  // Use the methods in HashSet
  public boolean isUniqueHashSet(String s) {
    Set<Character> list = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if (list.contains(s.charAt(i))) {
        return false;
      } else {
        list.add(s.charAt(i));
      }
    }
    return true;
  }

  // The uniqueness of the Hash
  public boolean isUniqueHash(String s) {
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      set.add(s.charAt(i));
    }
    return set.size() == s.length();
  }

  // Bit vector?
  public boolean isUnique(String s) {
    if (s.length() > 128) return false;

    boolean[] charSet = new boolean[128];
    for (int i = 0; i < s.length(); i++) {
      int val = s.charAt(i);
      if (charSet[val]) {
        return false;
      } else {
        charSet[val] = true;
      }
    }
    return true;
  }
}