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


## App design ##

![first-time-enter](/doc/image_design_doc/first_time_enter.png =280x420)
![home](/doc/image_design_doc/home.png)
![singleplayer](/doc/image_design_doc/singleplayer.png)
![statistics](/doc/image_design_doc/statistics.png)
![options](/doc/image_design_doc/options.png)
![how_to_play_1](/doc/image_design_doc/how_to_play_1.png)
![how_to_play_2](/doc/image_design_doc/how_to_play_2.png)
![how_to_play_3](/doc/image_design_doc/how_to_play_3.png)
