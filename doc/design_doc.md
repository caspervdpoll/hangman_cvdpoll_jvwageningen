# Design Doc Twisted Hangman #

## Database design ##

![user-db](/doc/user-table.png)
![word-db](/doc/words-table.png)
![statistics-db](/doc/Statistics-table.png)

## Classes ##

### User-class ###

#### functions ####

- getOptions(int user\_id)
- changeOptions(int id, string difficulty, string language, int word\_length, string name)

### Statistics-class ###

#### functions ####

- getStatistics(int user\_id)<br>
  return array(won, lost, played, difficulty)
- updateStatistics(int user\_id, string difficulty, string latest\_status)

### Game-class ###

#### functions ####

- initGame(user\_id)
- getWord(word\_id)<br>
  return string word
- drawScene()
- checkLetter(char letter, string word)<br>
  return boolean
- changeLetter(char letter, string status)
- updateHangman(int difficulty, int step)
- checkWord(string word, string guess)
- showCoffin()

