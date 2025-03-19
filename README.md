# Valores da Faixa de um Resistor

Se você precisa construir um componente usando o Raspberry Pi, provavelmente usará
resistores. Para este exercício, você precisa saber duas coisas sobre eles:
• Cada resistor tem um valor de resistência.
• Os resistores são pequenos - tão pequenos que, se você imprimir o valor da
resistência neles, seria difícil de ler.
Para resolver esse problema, os fabricantes imprimem faixas codificadas por cores nos
resistores para definir seus valores de resistência. Cada faixa tem uma posição e um valor
numérico.
As 2 primeiras faixas de um resistor têm um esquema de codificação simples: cada cor é
mapeada para um número único. Por exemplo, se eles imprimissem uma faixa marrom (valor 1) 
seguida por uma faixa verde (valor 5), seria traduzido para o número 15.
Neste exercício, você criará um programa em Java para não precisar se lembrar dos valores
das faixas. O programa receberá nomes de cores como entrada e produzirá um número de
dois dígitos, mesmo que a entrada tenha mais de duas cores! As cores da faixas são
codificadas da seguinte forma:
• Preto: 0
• Marrom: 1
• Vermelho 2
• Laranja: 3
• Amarelo: 4
• Verde: 5
• Azul: 6
• Violeta: 7
• Cinza: 8
• Branco: 9
Do exemplo acima: marrom-verde deve retornar 15 marrom-verde-violeta também deve
retornar 15, ignorando a terceira cor.
