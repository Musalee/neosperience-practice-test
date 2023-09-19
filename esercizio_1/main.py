# Variabili per ottenere la sequenza di fibonacci, alla prima è assegnato il numero precendente alla seconda 
# quello attuale
prevN = 0
n = 1

# Contatore per tenere conto della posizione della lista
counter = 0

while (True):
  # Incremento del contatore per ogni iterazione
  counter += 1
  
  # Controllo: 
  # Per controllare se il numero ha 1000 cifre o più viene effettuata un operazione di modulo (%)
  # Se un numero è divisibile per 10 allora ha almeno 2 cifre, se è divisibile per 100 allora ne ha 3, ecc
  # In questo caso effettuiamo l'operazione con un 1 seguito da 999 zeri per trovare il primo numero con 1000 cifre

  # Nel caso in cui il numero non fosse divisibile per un 1 seguito da 999 zeri (10^999) l'operazione di 
  # modulo resituirà il numero stesso. Possiamo quindi confrontare per il caso in cui l'operazione restituisce
  # un numero diverso, decretandolo il primo con 1000 cifre.
  if (n % 10**999 != n):
    print(f"Il primo numero di 1000 cifre nella sequenza di fibonacci è in posizione {counter}")
    break

  # Se il controllo non è verificato generiamo il prossimo numero della sequenza e impostiamo le variabili per la
  # prossima iterazione
  temp = prevN + n

  prevN = n
  n = temp
