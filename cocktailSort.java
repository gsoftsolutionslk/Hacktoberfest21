public class CocktailSort {
  static int temp;
  
  static void Cocktail(int a[], int n) {
    boolean is_swapped = true;
    int begin = 0, i;
    int end = n - 1;

    while (is_swapped) {
      is_swapped = false;
      for (i = begin; i < end; ++i) {
        if (a[i] > a[i + 1]) {
          temp = a[i];
          a[i] = a[i + 1];
          a[i + 1] = temp;
          is_swapped = true;
        }
      }
	  
      if (!is_swapped)
        break;
      is_swapped = false;
	  
      for (i = end - 1; i >= begin; --i) {
        if (a[i] > a[i + 1]) {
          temp = a[i];
          a[i] = a[i + 1];
          a[i + 1] = temp;
          is_swapped = true;
        }
      }
      ++begin;
    }
  }