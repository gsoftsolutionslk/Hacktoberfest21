a[] is an array of size N
begin BubbleSort(a[])
 
declare integer i, j
for i = 0 to N - 1
   for j = 0 to N - i - 1
      if a[j] > a[j+1] then 
         swap a[j], a[j+1]
      end if
   end for
  return a
   
end BubbleSort

a[] is an array of size N
begin SelectionSort(a[])
 
 for i = 0 to n - 1
      min = i    
       for j = i+1 to n 
         if list[j] < list[min] then
            min = j;
         end if
      end for
      if min != i  then
         swap list[min], list[i]
      end if
   end for
     
end SelectionSort