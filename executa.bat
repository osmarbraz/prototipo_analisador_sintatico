@echo off

if exist bin (
	echo  *** Executando projeto ***
	java -cp bin Principal %1 %2 %3
)