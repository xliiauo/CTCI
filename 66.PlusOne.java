class PlusOne {
  // digits to integer, plus one, integer to digits
  // not a good idea beacuse hard to handle very large numbers
  public int[] plusOneDigitsToNumber(int[] digits) {
    return new int[0];
  }

  // if sum less than 10, only update that digit, done
  // if sum bigger than 10, update that digit with sum % 10,
  //  continue until one digit doesn't have carry ons
  // if the first digit still have carry on, creat a new array start with 1
  //  append the rest array
  public int[] plusOne(int[] digits) {
    int length = digits.length;
    boolean carry = true;
    for (int i = length - 1; i >= 0; i--) {
      int sum = digits[i] + 1;
      if (sum < 10) {
        digits[i] = sum;
        carry = false;
        break;
      } else {
        digits[i] = sum % 10;
      }
    }

    if (carry) {
      int[] newDigits = new int[1 + length];
      newDigits[0] = 1;
      System.arraycopy(digits, 0, newDigits, 1, length);
      return newDigits;
    }

    return digits;
  }
}