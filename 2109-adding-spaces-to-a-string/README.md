<h2><a href="https://leetcode.com/problems/adding-spaces-to-a-string/">2109. Adding Spaces to a String</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> string <code style="user-select: auto;">s</code> and a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">spaces</code> that describes the indices in the original string where spaces will be added. Each space should be inserted <strong style="user-select: auto;">before</strong> the character at the given index.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, given <code style="user-select: auto;">s = "EnjoyYourCoffee"</code> and <code style="user-select: auto;">spaces = [5, 9]</code>, we place spaces before <code style="user-select: auto;">'Y'</code> and <code style="user-select: auto;">'C'</code>, which are at indices <code style="user-select: auto;">5</code> and <code style="user-select: auto;">9</code> respectively. Thus, we obtain <code style="user-select: auto;">"Enjoy <strong style="user-select: auto;"><u style="user-select: auto;">Y</u></strong>our <u style="user-select: auto;"><strong style="user-select: auto;">C</strong></u>offee"</code>.</li>
</ul>

<p style="user-select: auto;">Return<strong style="user-select: auto;"> </strong><em style="user-select: auto;">the modified string <strong style="user-select: auto;">after</strong> the spaces have been added.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
<strong style="user-select: auto;">Output:</strong> "Leetcode Helps Me Learn"
<strong style="user-select: auto;">Explanation:</strong> 
The indices 8, 13, and 15 correspond to the underlined characters in "Leetcode<u style="user-select: auto;"><strong style="user-select: auto;">H</strong></u>elps<u style="user-select: auto;"><strong style="user-select: auto;">M</strong></u>e<u style="user-select: auto;"><strong style="user-select: auto;">L</strong></u>earn".
We then place spaces before those characters.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "icodeinpython", spaces = [1,5,7,9]
<strong style="user-select: auto;">Output:</strong> "i code in py thon"
<strong style="user-select: auto;">Explanation:</strong>
The indices 1, 5, 7, and 9 correspond to the underlined characters in "i<u style="user-select: auto;"><strong style="user-select: auto;">c</strong></u>ode<u style="user-select: auto;"><strong style="user-select: auto;">i</strong></u>n<u style="user-select: auto;"><strong style="user-select: auto;">p</strong></u>y<u style="user-select: auto;"><strong style="user-select: auto;">t</strong></u>hon".
We then place spaces before those characters.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "spacing", spaces = [0,1,2,3,4,5,6]
<strong style="user-select: auto;">Output:</strong> " s p a c i n g"
<strong style="user-select: auto;">Explanation:</strong>
We are also able to place spaces before the first character of the string.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 3 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists only of lowercase and uppercase English letters.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= spaces.length &lt;= 3 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= spaces[i] &lt;= s.length - 1</code></li>
	<li style="user-select: auto;">All the values of <code style="user-select: auto;">spaces</code> are <strong style="user-select: auto;">strictly increasing</strong>.</li>
</ul>
</div>