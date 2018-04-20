
:do 
echo. path  ~1
goto :eof
forfiles /s /m  *.* /d +0 /c "cmd /c call :do  @path "

