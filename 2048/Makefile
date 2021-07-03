compile&run: compile run
compile:
	clear
	gcc 2048.c
run:
	./a.out
test: compile
	echo "2 0 0 2\n4 16 8 2\n2 64 32 4\n1024 1024 64 0\n0" | ./a.out
	echo "2 0 0 2\n4 16 8 2\n2 64 32 4\n1024 1024 64 0\n1" | ./a.out