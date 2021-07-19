:: Written By Joseph Telaak
:: DO NOT CHANGE
:: Version 2

:: I AM NOT RESPONSIBLE FOR ANY DAMAGE DONE BY THIS PROGRAM

@echo off
if exist eula.txt goto shell

:: Start
color c

title Joseph Telaak's Command Prompt

echo Copyright (c) 2019 Joseph Telaak
echo.
echo Written By Joseph Telaak
echo I am not responsible for any damage done by this tool
echo.
echo Continue if you agree to only use this tool for ethical purposes

timeout 10
cls

goto shell :: Remove comment to avoid next windows

if exist yee.txt (
	goto yee
) else (
	goto shell
)

:yee

color 07
echo.
echo 				*****YOU SHOULD FULL SCREEN THIS WINDOW*****
timeout 5
cls

color 70

type yee.txt
echo.
echo.
echo.
echo.

timeout 5
cls

:: Powershell

:Shell
color a
title Powershell Joseph Telaak's Powershell

echo Joseph Telaak's Powershell
echo Copyright (C) 2018 Joseph Telaak
echo.

cd ..
cd ..
cd ..
cd ..

powershell

echo Exiting Powershell...
echo Type "exit" to exit once more
timeout 2
cls

echo Joseph Telaak's Command Prompt
title Joseph Telaak's Command Prompt
echo Copyright (c) 2019 Joseph Telaak

echo.
:Loop
set /P the="%cd%>"
%the%
echo.
goto loop