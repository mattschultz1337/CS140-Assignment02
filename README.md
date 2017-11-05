<div data-pats="original_post" id="note" class="post_region_box question_note_view dashboard_element">
        
        <div class="duplicate" id="mark_dupe_form">
          <ol>
            <li>Scroll the left panel to find which question this is a duplicate of and click on it</li>
            <li>Click "Mark as Duplicate" button to complete</li>
          </ol>
          <ul>
            <li>Duplicate question: <span id="duplicate_title"></span></li>
            <li>Optional explanation: <input type="text" id="duplicate_reason"></li>
            <li>Marking duplicate of: <span id="duplicate_of_title"><b><i>-please select from left panel-</i></b></span></li>
          </ul>
          <button disabled="disabled" class="btn btn-danger btn-small" id="mark_duplicate" onclick="PEM.fire('question_mark_duplicate_submit')">Mark as Duplicate</button>
          <button class="btn btn-small" onclick="PEM.fire('question_mark_duplicate_cancel')">Cancel</button>
        </div>
      <div class="post_region_header clearFix">
        <div class="post_icon note "></div>
        
        <div data-pats="type_text" class="post_title">note</div>
        
        <div class="post_favorite is_not_favorite">
          <i class="icon_favorite is_favorite" onclick="PEM.fire('favorite', false);return false;"></i>
          <i class="icon_favorite not_favorite" onclick="PEM.fire('favorite', true);return false;" tutorial="Save this post to your favorites to find it later."></i>
        </div>
        
        <div class="post_converted_message">Your question is now a note.<div class="post_converted_message_close">x</div></div>
        <div class="post_view_count"><span class="count">68</span> views</div>
        <a href="#" class="follow_link hide" onclick="PEM.fire('question_note_stop_follow');return false;">stop following</a>
      </div>
      
      <div class="dropdown post_region_arrow_dropdown qa_actions_dropdown">
        <a href="#" class="dropdown-toggle">Actions <b class="caret"></b></a>
        <div class="dropdown_menu_wrapper clearFix">
          <ul class="dropdown-menu" role="menu" id="question_note_actions_dropdown" aria-labelledby="dLabel">
            
              <li onclick="PEM.fire('question_note_start_follow');return false;"><a href="#">Follow</a></li>
            
            
            
            <!--
            <li onclick="PEM.fire('mark_as_duplicate');return false;"><a href="#">Mark as Duplicate</a></li>
          -->
            
            
          </ul>
        </div>
      </div>
      
      <div class="post_region_content note" id="view_quesiton_note">
        
<h1 data-pats="title_text" class="post_region_title">assignment02 DUE September 8 11:59pm</h1>

<div class="post_region_text" id="questionText"><p><strong>All classes must be placed in the package assignment02 (put <tt>package assignment02;</tt> at the top of every file)</strong></p>
<p>&nbsp;</p>
<p>Write a class Utilities02 and in that class write the following methods</p>
<p>&nbsp;</p>
<p>1) A static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pln"> countNulls</span><span class="pun">(</span><span class="typ">Object</span><span class="pun">[]</span><span class="pln"> array</span><span class="pun">)</span></pre>
<p>which returns 0 if <tt>array</tt> is <tt>null</tt> or <em>empty</em>&nbsp;<tt>(array.length == 0)</tt> and otherwise the total number of elements in the array that are <tt>null</tt>. You test if a reference variable&nbsp;<tt>ref</tt> is null using <tt>ref == null</tt>. (This is usually the only place you use == with reference variables, although there are very special exceptions.)</p>
<p>&nbsp;</p>
<p>2) A static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pln"> countSpaces</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span></pre>
<p>&nbsp;</p>
<p>that returns -1 if <tt>str</tt> is <tt>null&nbsp;</tt>and otherwise the number of space characters in <tt>str</tt>. We expect the structure of the code in the method to be</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">int</span><span class="pln"> count </span><span class="pun">=</span><span class="pln"> </span><span class="pun">-</span><span class="lit">1</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">if</span><span class="pun">(</span><span class="pln">str </span><span class="pun">!=</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	count </span><span class="pun">=</span><span class="pln"> </span><span class="lit">0</span><span class="pun">;</span><span class="pln">
	</span><span class="com">// do the counting here</span><span class="pln">
</span><span class="pun">}</span><span class="pln">
</span><span class="kwd">return</span><span class="pln"> count</span><span class="pun">;</span></pre>
<p>The test for a space character is <tt>str.charAt(i) == ' '</tt></p>
<p>&nbsp;</p>
<p>3) Write a second method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pln"> countSpaces2</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span></pre>
<p>where, if str is nit null, you first use</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">char</span><span class="pun">[]</span><span class="pln"> arr </span><span class="pun">=</span><span class="pln"> str</span><span class="pun">.</span><span class="pln">toCharArray</span><span class="pun">();</span></pre>
<p>&nbsp;</p>
<p>and then count the spaces with <tt>(arr[i] == ' ')</tt></p>
<p>&nbsp;</p>
<p>4) A static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> first</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span></pre>
<p>&nbsp;</p>
<p>that returns <tt>null</tt> if <tt>str</tt> is <tt>null</tt>, an empty String if <tt>str</tt> is empty or all spaces and otherwise the first word of <tt>str</tt>, ignoring leading spaces. The layout of this code is:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">String</span><span class="pln"> returnVal </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">if</span><span class="pun">(</span><span class="pln">str </span><span class="pun">!=</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
</span><span class="com">// set returnVal to str.trim(), which removes all leading and trailing space</span><span class="pln">
</span><span class="com">// set i to be returnVal.indexOf(' ')</span><span class="pln">
</span><span class="com">// if i &gt;= 0, meaning there are more than one words in str, change returnVal to</span><span class="pln">
</span><span class="com">// returnVal.substring(0,i)</span><span class="pln">
</span><span class="pun">}</span><span class="pln">
</span><span class="kwd">return</span><span class="pln"> returnVal</span><span class="pun">;</span></pre>
<p>&nbsp;</p>
<p>5) A static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> rest</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span><span class="pln"> </span></pre>
<p>which returns a String with no leading or trailing spaces, which is <tt>str</tt> with the first word removed. Return <tt>null</tt> if <tt>str</tt> is <tt>null</tt>.</p>
<p>&nbsp;</p>
<p>The code is similar to that of <tt>first</tt> but <tt>if i &gt;= 0</tt>, <tt>returnVal</tt> is replaced by&nbsp;<tt>retVal.substring(i+1).trim()</tt> else <tt>returnVal</tt> is the empty String.</p>
<p>&nbsp;</p>
<p>6) A static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> withoutExtraSpaces</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span></pre>
<p>&nbsp;</p>
<p>which removes extra spaces between words, so that whenever <tt>str</tt> has more than one space together, they are reduced to one space. The structure is as follows</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">String</span><span class="pln"> returnVal </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">if</span><span class="pun">(</span><span class="pln">str </span><span class="pun">!=</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
</span><span class="com">//assign returnVal to str.trim() and the ints len1 and len2 to 0</span><span class="pln">
</span><span class="com">//in a do { ... } while(len2 &lt; len1);</span><span class="pln">
</span><span class="com">//execute set len1 to the length of returnVal, change returnVal to returnVal.replace("  ", " ")</span><span class="pln">
</span><span class="com">//and set len2 to the length of the new returnVal</span><span class="pln">
</span><span class="pun">}</span><span class="pln">
</span><span class="kwd">return</span><span class="pln"> returnVal</span><span class="pun">;</span></pre>
<p>&nbsp;</p>
<p>7) A static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="typ">String</span><span class="pun">[]</span><span class="pln"> splitOnSpaces</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span></pre>
<p>&nbsp;</p>
<p>which creates an array of the words in <tt>str</tt>. If <tt>str</tt> is null it returns null and if <tt>str</tt> has no words, return an empty array.</p>
<p>&nbsp;</p>
<p><strong>CORRECTED September 4:</strong></p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">Define</span><span class="pln"> len to be countSpaces</span><span class="pun">(</span><span class="pln">withoutExtraSpaces</span><span class="pun">(</span><span class="pln">str</span><span class="pun">))</span><span class="pln">
</span><span class="com">//if len is not 0, len + 1 is exactly the number of words in str</span><span class="pln">
</span><span class="com">//if len is 0, there is a bit more work--depends if there is one word or no word</span><span class="pln">
</span><span class="typ">String</span><span class="pun">[]</span><span class="pln"> returnVal </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">if</span><span class="pun">(</span><span class="pln">len </span><span class="pun">&gt;=</span><span class="pln"> </span><span class="lit">0</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
</span><span class="com">//in the case str.trim() has length 0, the return value is {}, the empty array </span><span class="pln">
</span><span class="com">//otherwise change returnVal to an array of length len+1</span><span class="pln">
</span><span class="com">//in a for loop set returnVal[i] to first(str) and change str to rest(str)</span><span class="pln">
</span><span class="pun">}</span><span class="pln">
</span><span class="kwd">return</span><span class="pln"> returnVal</span><span class="pun">;</span></pre>
<p>&nbsp;</p>
<p>8) A static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> strLengths</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span></pre>
<p>which is an array of the lengths of the words in <tt>str</tt>. Use <tt>splitOnSpaces</tt> to get the array of words and make a corresponding int array for the lengths. If <tt>str</tt> gives a <tt>null</tt> and empty array using&nbsp;<tt>splitOnSpaces</tt>&nbsp;then <tt>strLengths</tt> give <tt>null</tt> and empty.</p>
<p>&nbsp;</p>
<p>9) Look at the notes for Slides 03 and import <tt>java.util.Optional</tt> and write a static method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="typ">Optional</span><span class="pun">&lt;</span><span class="typ">String</span><span class="pun">[]&gt;</span><span class="pln"> splitOnSpaces1</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span></pre>
<p>&nbsp;</p>
<p>which solves the problem of how long to make the array in a different way. First we make an array as long as the total length of <tt>str</tt> and then we just keep the first part of the array using <tt>Arrays.copyOf</tt>. Arrays is a class we'll need to import - add the line <tt>import java.util.Arrays;</tt> at the top of the class, underneath the package statement. Another difference is that in this case a null String and a String with no words (empty or only spaces) both return Optional.empty().</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">String</span><span class="pun">[]</span><span class="pln"> returnVal </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">null</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">if</span><span class="pln"> </span><span class="pun">(</span><span class="pln">str </span><span class="pun">!=</span><span class="pln"> </span><span class="kwd">null</span><span class="pln"> </span><span class="pun">&amp;&amp;</span><span class="pln"> str</span><span class="pun">.</span><span class="pln">trim</span><span class="pun">().</span><span class="pln">length</span><span class="pun">()</span><span class="pln"> </span><span class="pun">&gt;</span><span class="pln"> </span><span class="lit">0</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
</span><span class="com">//set returnVal to be an array of length str.length()</span><span class="pln">
</span><span class="com">//introduce index = 0</span><span class="pln">
</span><span class="com">// while the length of str in non-zero set returnVal[index] to first(str), set str equal to rest(str)</span><span class="pln">
</span><span class="com">// and add 1 to index</span><span class="pln">
</span><span class="com">// After the while loop truncate the array using returnVal = Arrays.copyOf(returnVal, index);</span><span class="pln">
</span><span class="kwd">return</span><span class="pln"> </span><span class="typ">Optional</span><span class="pun">.</span><span class="pln">of</span><span class="pun">(</span><span class="pln">returnVal</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span><span class="pln">
</span><span class="kwd">else</span><span class="pln"> </span><span class="kwd">return</span><span class="pln"> </span><span class="typ">Optional</span><span class="pun">.</span><span class="pln">empty</span><span class="pun">();</span></pre>
<p>&nbsp;</p>
<p>Write a class <tt>Tester</tt> with a <tt>main</tt> method. In the <tt>main</tt> method write the following tests:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"Expected value 0"</span><span class="pun">);</span><span class="pln">
</span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="typ">Utilities02</span><span class="pun">.</span><span class="pln">countNulls</span><span class="pun">(</span><span class="kwd">null</span><span class="pun">));</span><span class="pln">
</span><span class="typ">Object</span><span class="pun">[]</span><span class="pln"> test </span><span class="pun">=</span><span class="pln"> </span><span class="pun">{};</span><span class="pln">&nbsp;
</span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"Expected value 0"</span><span class="pun">);</span><span class="pln">
</span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="typ">Utilities02</span><span class="pun">.</span><span class="pln">countNulls</span><span class="pun">(</span><span class="pln">test</span><span class="pun">));</span><span class="pln">
</span><span class="com">// another test with a non empty array of Objects (can be String[], Integer[], </span><span class="pln">
</span><span class="com">// java.awt.Rectangle, etc) and some nulls that gives a non-zero expected value,</span><span class="pln">
</span><span class="com">// e.g. countNulls(new Integer[]{null, 1, null, 2,})</span></pre>
<p>&nbsp;</p>
<p>For printing out any array <tt>ARR</tt>, we should import<tt> java.util Arrays</tt> and call</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="typ">Arrays</span><span class="pun">.</span><span class="pln">toString</span><span class="pun">(</span><span class="pln">ARR</span><span class="pun">));</span></pre>
<p>&nbsp;</p>
<p>Write 4 tests for Utilities02.countSpaces, and&nbsp;Utilities02.countSpaces2. The null String (null), the empty String (""), one String with no spaces and one String with several spaces. Print the expected value in each case. We will use methods from the String class, see&nbsp;<a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html" target="_blank" rel="noreferrer">https://docs.oracle.com/javase/8/docs/api/java/lang/String.html</a></p>
<p>&nbsp;</p>
<p>Write 7 tests for Utilities02.first (in each case print the expected value as well). The tests are the null String, the empty String, a String with only several spaces, a single word with leading and trailing spaces, a single word without leading spaces, a string of words separated by spaces and with leading and trailing space, and a string of words without leading space. (You need to make sure your code does not accidentally skip the first word if there is no leading space.)</p>
<p>&nbsp;</p>
<p>Use the same tests for Utilities02.rest.</p>
<p>&nbsp;</p>
<p>Repeat a selection of the tests above and put multiple spaces between the words to check that Utilities02.withoutExtraSpaces works correctly.</p>
<p>&nbsp;</p>
<p>Check&nbsp;Utilities02.splitOnSpaces for the null String, the empty String, and a String withe plenty of words and spaces.</p>
<p>&nbsp;</p>
<p>Write tests for&nbsp;Utilities02.splitOnSpaces1 and&nbsp;Utilities02.stringLengths.</p>
<p>&nbsp;</p>
<p>Here is the style of the test for Optional types:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">Optional</span><span class="pun">&lt;</span><span class="typ">String</span><span class="pun">[]&gt;</span><span class="pln"> array </span><span class="pun">=</span><span class="pln"> </span><span class="typ">Utilities02</span><span class="pun">.</span><span class="pln">splitOnSpaces1</span><span class="pun">(</span><span class="str">" should give an array of   these words  separated by commas   "</span><span class="pun">);</span><span class="pln">
</span><span class="kwd">if</span><span class="pun">(</span><span class="pln">array</span><span class="pun">.</span><span class="pln">isPresent</span><span class="pun">())</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="typ">Arrays</span><span class="pun">.</span><span class="pln">toString</span><span class="pun">(</span><span class="pln">array</span><span class="pun">.</span><span class="kwd">get</span><span class="pun">()));</span><span class="pln">
</span><span class="pun">}</span><span class="pln"> </span><span class="kwd">else</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="str">"The input was null or empty"</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>&nbsp;</p>
<p>Write another class InstanceMethodVersion with one private field <tt>String string</tt>. Provide a constructor that sets the value of string and change method2 2 through 8 above into instance methods of this new class</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="typ">InstanceMethodVersion</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="kwd">string</span><span class="pln"> </span><span class="pun">=</span><span class="pln"> str</span><span class="pun">;</span><span class="pln">
</span><span class="pun">}</span><span class="pln"> 

</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">int</span><span class="pln"> countSpaces</span><span class="pun">()</span><span class="pln"> </span><span class="com">// counts the spaces in the field string</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">int</span><span class="pln"> countSpaces2</span><span class="pun">()</span><span class="pln"> </span><span class="com">// counts the spaces in the field string</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> withoutExtraSpaces</span><span class="pun">()</span><span class="pln"> </span><span class="com">// returns a copy of the field string without the extra spaces</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> first</span><span class="pun">()</span><span class="pln"> </span><span class="com">// returns the first word in the field string</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> rest</span><span class="pun">()</span><span class="pln"> </span><span class="com">// returns the remainder of the field string removing the first word</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="typ">String</span><span class="pun">[]</span><span class="pln"> splitOnSpaces</span><span class="pun">()</span><span class="pln"> </span><span class="com">// returns an array of the words in the field string SEE BELOW</span><span class="pln">
</span><span class="pun">(</span><span class="pln">skip splitOnSpaces1</span><span class="pun">)</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">int</span><span class="pun">[]</span><span class="pln"> strLengths</span><span class="pun">()</span><span class="pln"> </span><span class="com">// returns an array of the lengths of the words in the field string</span></pre>
<p>&nbsp;</p>
<p><strong>ADDITION September 4</strong></p>
<p>&nbsp;</p>
<p>OK, splitOnSpaces is tricky.</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="typ">First</span><span class="pln"> make
</span><span class="typ">InstanceMethodVersion</span><span class="pln"> temp </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">InstanceMethodVersion</span><span class="pun">(</span><span class="pln">withoutExtraSpaces</span><span class="pun">());</span><span class="pln">
</span><span class="kwd">and</span><span class="pln">
</span><span class="kwd">int</span><span class="pln"> len </span><span class="pun">=</span><span class="pln"> temp</span><span class="pun">.</span><span class="pln">countSpaces</span><span class="pun">();</span><span class="pln">

</span><span class="typ">Next</span><span class="pln"> just before the </span><span class="kwd">for</span><span class="pln"> loop change temp to </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">InstanceMethodVersion</span><span class="pun">(</span><span class="kwd">string</span><span class="pun">.</span><span class="pln">trim</span><span class="pun">());</span><span class="pln">
</span><span class="kwd">and</span><span class="pln"> </span><span class="kwd">in</span><span class="pln"> the </span><span class="kwd">for</span><span class="pln"> loop change </span><span class="kwd">use</span><span class="pln"> returnVal</span><span class="pun">[</span><span class="pln">i</span><span class="pun">]</span><span class="pln"> </span><span class="pun">=</span><span class="pln"> temp</span><span class="pun">.</span><span class="pln">first</span><span class="pun">();</span><span class="pln">&nbsp;
</span><span class="kwd">and</span><span class="pln"> change temp to </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">InstanceMethodVersion</span><span class="pun">(</span><span class="pln">temp</span><span class="pun">.</span><span class="pln">rest</span><span class="pun">());</span><span class="pln">
</span></pre>
<p>&nbsp;</p>
<p><strong>TESTING</strong></p>
<p>&nbsp;</p>
<p>Repeat all the previous tests for methods 2 through 7 of <tt>Utilities02</tt> for the methods of <tt>InstanceMethodVersion</tt> by making different objects by passing all your test Strings above into the constructors of these different objects.<tt> </tt></p>
<p>&nbsp;</p>
<p>FOOTNOTE: You CANNOT use this technique but there is a quick way to do splitOnSpaces1:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="typ">Optional</span><span class="pun">&lt;</span><span class="typ">String</span><span class="pun">[]&gt;</span><span class="pln"> splitOnSpaces1</span><span class="pun">(</span><span class="typ">String</span><span class="pln"> str</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="kwd">if</span><span class="pln"> </span><span class="pun">(</span><span class="pln">str </span><span class="pun">!=</span><span class="pln"> </span><span class="kwd">null</span><span class="pln"> </span><span class="pun">&amp;&amp;</span><span class="pln"> str</span><span class="pun">.</span><span class="pln">trim</span><span class="pun">().</span><span class="pln">length</span><span class="pun">()</span><span class="pln"> </span><span class="pun">&gt;</span><span class="pln"> </span><span class="lit">0</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
		</span><span class="kwd">return</span><span class="pln"> </span><span class="typ">Optional</span><span class="pun">.</span><span class="pln">of</span><span class="pun">(</span><span class="pln">str</span><span class="pun">.</span><span class="pln">trim</span><span class="pun">().&lt;</span><span class="pln">strong</span><span class="pun">&gt;</span><span class="pln">split</span><span class="pun">&lt;/</span><span class="pln">strong</span><span class="pun">&gt;(</span><span class="str">"\\s+"</span><span class="pun">));</span><span class="pln">
	</span><span class="pun">}</span><span class="pln">
	</span><span class="kwd">return</span><span class="pln"> </span><span class="typ">Optional</span><span class="pun">.</span><span class="pln">empty</span><span class="pun">();</span><span class="pln">
</span><span class="pun">}</span></pre><br></div>
<div data-pats="folders" class="post_region_folders">
  <span>
    <span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'assignment2'});return false;">assignment2</a></span>
  </span>
</div>
<div class="attachments" style="display:none;">
  <div class="attachments_divider"></div>
  <div class="attachments_count">Attachments:</div>
  <table class="attachments_list">
    
  </table>
</div>
<div class="post_region_message_wrapper">
  <div id="endorse_text"></div>
  
  
  

      </div>
    </div>
    <div class="post_region_content edit_mode" style="display:none;" id="edit_question_note">
      <h3>Summary</h3>
      <input class="post_region_input" id="edit_question_note_subject" placeholder="Post Summary">
      <div class="error_message no_summary">Please enter a brief summary of your post.</div>
      <div class="error_message long_summary">Please enter a summary with no more than 100 characters.</div>
      
      
      <span style="float: right" class="input_links grey_text"><a href="#" class="richtext_toggle" onclick="return PEM.fire('toggleRichtext')">use plain text editor</a></span>
      
      <span class="input_links grey_text" style="margin-right:10px;">Report any bugs with our editor to bugs@piazza.com</span>
      <h3>Details</h3>
      <div id="question_note_editor"></div>
      <div class="error_message no_details">Please provide some details to better explain your question.</div>

      <div class="post_edit_meta_wrapper" style="display:block">
        
        <div class="post_edit_meta clearFix" id="content_folders">
            <label>Folders:</label>
            <ul id="edit_quesiton_note_folders">
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment1</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder selected" onclick="return P.note_view.editFolderClick(this);">assignment2</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment3</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment4</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment5</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment6</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment7</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment8</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment9</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment10</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">assignment11</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab1</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab2</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab3</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab4</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab5</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab6</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab7</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab8</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab9</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab10</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">lab11</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">exam1</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">exam2</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">project</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">logistics</a></li>
              
                <li data-pats="folders_item"><a data-pats="link" href="#" class="tag folder " onclick="return P.note_view.editFolderClick(this);">other</a></li>
              
            </ul>
        </div>
        <div class="error_message no_folders">Please select at least one folder for your post.</div>
        
        
          <div class="post_edit_meta clearFix" id="content_type_selector">
              <label>Save as:</label>
              <input type="radio" name="question_type" id="question_type_0" value="Question"><label for="question_type_0">  Question  (this needs an answer)</label>
              <input type="radio" name="question_type" id="question_type_1" value="Note" checked=""><label for="question_type_1">  Note  (this doesn't need an answer)</label>
          </div>
        
        
        <div class="post_edit_meta clearFix" id="content_type_selector">
            <label>Visible to:</label>
            <input type="radio" name="question-visibility" id="question_visibility_0" onchange="P.note_view.visibilityChange()" value="entire_class" checked=""><label for="question_visibility_0" style="font-weight: bold;">&nbsp;Entire class</label>&nbsp;&nbsp;
            <input type="radio" name="question-visibility" id="question_visibility_1" onchange="P.note_view.visibilityChange()" class="edit-sections" value="sections"><label for="question_visibility_1" style="font-weight: bold;">&nbsp;Group</label>&nbsp;&nbsp;
            <input type="radio" name="question-visibility" id="question_visibility_2" onchange="P.note_view.visibilityChange()" value="private"><label for="question_visibility_2" class="" style="font-weight: bold;margin-right: 0px;">&nbsp;Private</label><span style="font-weight: normal;">
              
              <label style="font-weight:normal;"> to original poster and Instructors</label>
              
            
            </span>
        </div>
        
        
        <div id="subgroup_list_edit" style="display:none;margin-top:5px;margin-left:5px;">
          <select id="subgroup_dropdown_edit" class="anonymity_selector" onchange="P.note_view.subGroupChange()">
            
            
            <option value="a54">a54</option>
            
          </select>
          <div class="error_wrapper" id="not-in-section-student-edit" style="display: none;">
            <div class="error main">You are currently not in this group</div>
            <div class="error sub">Please ask your instructor to enroll you to this group on Piazza</div>
          </div>
          <div class="error_wrapper" id="not-in-section-can-join-edit" style="display: none;">
            <div class="error main">You are currently not in this group</div>
            <div class="error sub">You have to join this group to post</div>
          </div>
          <div class="error_wrapper" id="not-in-section-instructor-edit" style="display: none;">
            <div class="error main">You are currently not in this group</div>
            <div class="error sub">You will not see this post in your feed</div>
          </div>
        </div>
        
      </div>
    </div>
    <div class="post_region_message_wrapper currently_editing" style="display:none;margin-top:0px;">
      <div class="post_region_message warning show">
        <span class="editing_message"></span>
      </div>
    </div>
    <div class="post_region_actions note" id="view_question_note_bar">
      
      <div data-pats="updated_text" class="post_region_actions_meta">Updated <span title="Wed Sep 06 2017 20:16:52 GMT-0400 (EDT)">1 month ago</span> by
      
        <span anon="no" class="user_name user_name_i5e3ec7qrg8330">Shawn Bailey</span>
      


      and <span anon="undefined" class="user_name user_name_iju6iqt2h4n48o">Leslie Lander</span>
      </div>
    </div>
    <div class="post_region_actions edit_mode" id="edit_question_note_bar">
      <a data-pats="submit_button" class="post_action submit main btn btn-primary btn-mini" href="#" onclick="PEM.fire('question_note_edit_submit');return false;">submit</a>
      
       &nbsp;&nbsp;as <select class="anonymity_selector" id="edit_quesiton_anonymity">
          
          <option value="no">Matthew Schultz</option>
          
          <option value="stud">Anonymous to Classmates</option>
          
          <option value="full">Anonymous to everyone</option>
          
        </select>
      
      <span class="middot">·</span>
      <a class="post_action preview" href="#" onclick="return PEM.fire('previewPost', 'question_note_edit')">preview</a>
      <a class="post_action cancel right" href="#" onclick="PEM.fire('cancelOne', 'question_note_edit');return false;">cancel</a>
    </div>
</div>
