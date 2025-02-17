<h2><a href="https://leetcode.com/problems/sliding-puzzle/">773. Sliding Puzzle</a></h2><h3>Hard</h3><hr><div style="user-select: text;"><p style="user-select: text;">On an <code style="user-select: text;">2 x 3</code> board, there are five tiles labeled from <code style="user-select: text;">1</code> to <code style="user-select: text;">5</code>, and an empty square represented by <code style="user-select: text;">0</code>. A <strong style="user-select: text;">move</strong> consists of choosing <code style="user-select: text;">0</code> and a 4-directionally adjacent number and swapping it.</p>

<p style="user-select: text;">The state of the board is solved if and only if the board is <code style="user-select: text;">[[1,2,3],[4,5,0]]</code>.</p>

<p style="user-select: text;">Given the puzzle board <code style="user-select: text;">board</code>, return <em style="user-select: text;">the least number of moves required so that the state of the board is solved</em>. If it is impossible for the state of the board to be solved, return <code style="user-select: text;">-1</code>.</p>

<p style="user-select: text;">&nbsp;</p>
<p style="user-select: text;"><strong class="example" style="user-select: text;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/06/29/slide1-grid.jpg" style="width: 244px; height: 165px; user-select: text;">
<pre style="user-select: text;"><strong style="user-select: text;">Input:</strong> board = [[1,2,3],[4,0,5]]
<strong style="user-select: text;">Output:</strong> 1
<strong style="user-select: text;">Explanation:</strong> Swap the 0 and the 5 in one move.
</pre>

<p style="user-select: text;"><strong class="example" style="user-select: text;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/06/29/slide2-grid.jpg" style="width: 244px; height: 165px; user-select: text;">
<pre style="user-select: text;"><strong style="user-select: text;">Input:</strong> board = [[1,2,3],[5,4,0]]
<strong style="user-select: text;">Output:</strong> -1
<strong style="user-select: text;">Explanation:</strong> No number of moves will make the board solved.
</pre>

<p style="user-select: text;"><strong class="example" style="user-select: text;">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/06/29/slide3-grid.jpg" style="width: 244px; height: 165px; user-select: text;">
<pre style="user-select: text;"><strong style="user-select: text;">Input:</strong> board = [[4,1,2],[5,0,3]]
<strong style="user-select: text;">Output:</strong> 5
<strong style="user-select: text;">Explanation:</strong> 5 is the smallest number of moves that solves the board.
An example path:
After move 0: [[4,1,2],[5,0,3]]
After move 1: [[4,1,2],[0,5,3]]
After move 2: [[0,1,2],[4,5,3]]
After move 3: [[1,0,2],[4,5,3]]
After move 4: [[1,2,0],[4,5,3]]
After move 5: [[1,2,3],[4,5,0]]
</pre>

<p style="user-select: text;">&nbsp;</p>
<p style="user-select: text;"><strong style="user-select: text;">Constraints:</strong></p>

<ul style="user-select: text;">
	<li style="user-select: text;"><code style="user-select: text;">board.length == 2</code></li>
	<li style="user-select: text;"><code style="user-select: text;">board[i].length == 3</code></li>
	<li style="user-select: text;"><code style="user-select: text;">0 &lt;= board[i][j] &lt;= 5</code></li>
	<li style="user-select: text;">Each value <code style="user-select: text;">board[i][j]</code> is <strong style="user-select: text;">unique</strong>.</li>
</ul>
</div>