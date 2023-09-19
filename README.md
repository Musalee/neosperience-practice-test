# Neosperience Practice Test

## Fase 1

Per la fase 1 è stato utilizzato python (v3.11) in quanto in grado di gestire con semplicità numeri con molte cifre

### Fase 2

Per la fase 2 era richiesto l'utilizzo del paradigma a oggetti ed è stato quindi utilizzato Java (v17)

### Fase 3

Per la fase 3 l'API Rest è stato realizzato con Spring Boot

Esempi di utilizzo:

- POST /students

  ```
  curl -X POST http://localhost:8080/students \
    -H 'Content-Type: application/json' \
    -d '{
      "firstname": "Samuele",
      "lastname": "Questa",
      "birthdate": "09/07/2004",
      "grades": "7,8,7,9,6,7"
    }'
  ```

- GET /students

  ```
  curl http://localhost:8080/students
  ```
