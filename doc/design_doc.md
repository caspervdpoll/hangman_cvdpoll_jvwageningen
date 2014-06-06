# Design Doc Twisted Hangman #

## Database design ##

![user-db](/doc/user-table.png)
![word-db](/doc/words-table.png)
![statistics-db](/doc/Statistics-table.png)

## Classes ##

### User-class ###

#### functions ####

- getOptions(int user_id)
- change_options(int id, string difficulty, string language, int word-length, string name)

### Statistics-class ###

#### functions ####

- getStatistics(int user_id)<br>
  return array(won, lost, played, difficulty)
- UpdateStatistics(int user_id, string difficulty, string latest-status)

### Game-class ###

#### functions ####

- init-game(user_id)
- get-word(word_id)<br>
  return string word
- draw-scene()
- checkLetter(char letter, string word)<br>
  return boolean
- changeLetter(char letter, string status)
- update-hangman(int difficulty, int step)
- checkWord(string woord, string guess)
- showCoffin()

