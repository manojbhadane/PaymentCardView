
for i in 1 2 3 4 5 6 7 8 9 10
do
  echo "------------------"
  echo "Commit Number : $i"
  echo "some data" >> sample.txt
  git add .
  git commit -m "minor changes" 
  git push origin master
done
