<h2><a href="https://leetcode.com/problems/maximum-matrix-sum/">1975. Maximum Matrix Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">n x n</code> integer <code style="user-select: auto;">matrix</code>. You can do the following operation <strong style="user-select: auto;">any</strong> number of times:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Choose any two <strong style="user-select: auto;">adjacent</strong> elements of <code style="user-select: auto;">matrix</code> and <strong style="user-select: auto;">multiply</strong> each of them by <code style="user-select: auto;">-1</code>.</li>
</ul>

<p style="user-select: auto;">Two elements are considered <strong style="user-select: auto;">adjacent</strong> if and only if they share a <strong style="user-select: auto;">border</strong>.</p>

<p style="user-select: auto;">Your goal is to <strong style="user-select: auto;">maximize</strong> the summation of the matrix's elements. Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum</strong> sum of the matrix's elements using the operation mentioned above.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/16/pc79-q2ex1.png" style="width: 401px; height: 81px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [[1,-1],[-1,1]]
<strong style="user-select: auto;">Output:</strong> 4
<b style="user-select: auto;">Explanation:</b> We can follow the following steps to reach sum equals 4:
- Multiply the 2 elements in the first row by -1.
- Multiply the 2 elements in the first column by -1.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/16/pc79-q2ex2.png" style="width: 321px; height: 121px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matrix = [[1,2,3],[-1,-2,-3],[1,2,3]]
<strong style="user-select: auto;">Output:</strong> 16
<b style="user-select: auto;">Explanation:</b> We can follow the following step to reach sum equals 16:
- Multiply the 2 last elements in the second row by -1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == matrix.length == matrix[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 250</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= matrix[i][j] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>