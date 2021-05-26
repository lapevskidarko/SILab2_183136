# Втора лабораториска вежба по Софтверско инженерство
## Дарко Лапевски, бр. на индекс 183136

### Control Flow Graph
![alt text](img/silab2cfg.png )

### Цикломатска комплексност
 Цикломатската комплексност на дадениот код е 8 и истата ја одредив после цртањето на CFG со броење на регионите.

### Тест случаи според критериумот Multiple condition

if (hr < 0 || hr > 24)

|Combination|Possible test case|Branch |
|-----------|------------------|-------|
|TF         |-1                |7,8-9  |
|FT         |25                |7,8-10 |
|FF         |1                 |7-11   |

- За комбинација ТТ нема валиден тест случај па затоа оваа комбинација се отфрла.

if (hr < 24)
|Combination|Possible test case|Branch |
|-----------|------------------|-------|
|T         |23                |11-12  |
|F         |24                |11-18 |

  if (min < 0 || min > 59)

|Combination|Possible test case|Branch    |
|-----------|------------------|----------|
|TF         |-15               |12-13  |
|FT         |60                |12-13  |
|FF         |33                |12,14-15      |

- За комбинација ТТ нема валиден тест случај па затоа оваа комбинација се отфрла.

 if (sec >= 0 && sec <= 59)

|Combination|Possible test case|Branch    |
|-----------|------------------|----------|
|TТ         |55              |15-16  |
|FT         |-5               |15-17  |
|TF         |61               |15-17  |

- За комбинација FF нема валиден тест случај па затоа оваа комбинација се отфрла.

if (hr == 24 && min == 0 && sec == 0)

|Combination|Possible test case|Branch    |
|-----------|------------------|----------|
|TТT         |24:0:0           |18-19 |
|TTF,TFF     |-5               |18-20 |
 - За комбинациите каде една или сите вредности се False условот нема да помине и ќе оди на следна инструкција.

