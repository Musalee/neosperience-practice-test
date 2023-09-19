prevN = 0
n = 1
counter = 0

while (True):
  counter += 1
  
  if (n % 10**999 != n):
    print(f"Il primo numero di 1000 cifre nella sequenza di fibonacci è in posizione {counter}")
    break

  temp = prevN + n
  prevN = n

  n = temp
