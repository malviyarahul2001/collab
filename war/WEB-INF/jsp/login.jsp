<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Simple CSS for HTML forms.">

    <title>Forms &ndash; Pure</title>

<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">

<link rel="stylesheet" href="/combo/1.6.3?/css/main.css&/css/rainbow/baby-blue.css">

    
<script src="http://use.typekit.net/gis6vng.js"></script>
<script>
    try { Typekit.load(); } catch (e) {}
</script>


    
<script>
(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
})(window,document,'script','//www.google-analytics.com/analytics.js','ga');

ga('create', 'UA-41480445-1', 'purecss.io');
ga('send', 'pageview');
</script>


</head>
<body>

    <div class="pure-g-r" id="layout">
        <a href="#menu" id="menuLink" class="pure-menu-link">
    <span></span>
</a>


<div class="header">
    <h1>Forms</h1>

  
    <h2>Simple CSS for HTML forms.</h2>
  
</div>


<div class="content">

    <h2 id="stacked-form" class="content-subhead">Stacked Form<a href="#stacked-form" class="content-link"></a></h2>
    <p>
        To create a stacked form with input elements below the labels, add the <code>pure-form-stacked</code> classname to a <code>&lt;form&gt;</code> element alongside <code>pure-form</code>.
    </p>

  
    <form class="pure-form pure-form-stacked">
    <fieldset>
        <legend>A Stacked Form</legend>

        <label for="stacked-email">Email</label>
        <input id="stacked-email" type="email" placeholder="Email">

        <label for="stacked-password">Password</label>
        <input id="stacked-password" type="password" placeholder="Password">

        <label for="stacked-state">State</label>
        <select id="stacked-state">
            <option>AL</option>
            <option>CA</option>
            <option>IL</option>
        </select>

        <label for="stacked-remember" class="pure-checkbox">
            <input id="stacked-remember" type="checkbox"> Remember me
        </label>

        <button type="submit" class="pure-button pure-button-primary">Sign in</button>
    </fieldset>
</form>

  <pre class="snippet" data-language="html"><code>&lt;form class=&quot;pure-form pure-form-stacked&quot;&gt;
    &lt;fieldset&gt;
        &lt;legend&gt;A Stacked Form&lt;/legend&gt;

        &lt;label for=&quot;email&quot;&gt;Email&lt;/label&gt;
        &lt;input id=&quot;email&quot; type=&quot;email&quot; placeholder=&quot;Email&quot;&gt;

        &lt;label for=&quot;password&quot;&gt;Password&lt;/label&gt;
        &lt;input id=&quot;password&quot; type=&quot;password&quot; placeholder=&quot;Password&quot;&gt;

        &lt;label for=&quot;state&quot;&gt;State&lt;/label&gt;
        &lt;select id=&quot;state&quot;&gt;
            &lt;option&gt;AL&lt;/option&gt;
            &lt;option&gt;CA&lt;/option&gt;
            &lt;option&gt;IL&lt;/option&gt;
        &lt;/select&gt;

        &lt;label for=&quot;remember&quot; class=&quot;pure-checkbox&quot;&gt;
            &lt;input id=&quot;remember&quot; type=&quot;checkbox&quot;&gt; Remember me
        &lt;/label&gt;

        &lt;button type=&quot;submit&quot; class=&quot;pure-button pure-button-primary&quot;&gt;Sign in&lt;/button&gt;
    &lt;/fieldset&gt;
&lt;/form&gt;</code></pre>


    <h2 id="checkboxes-and-radios" class="content-subhead">Checkboxes and Radios<a href="#checkboxes-and-radios" class="content-link"></a></h2>
    <p>
        To normalize and align checkboxes and radio inputs, add the <code>pure-checkbox</code> or <code>pure-radio</code> classname.
    </p>

  
    <form class="pure-form">
    <label for="checkbox-radio-option-one" class="pure-checkbox">
        <input id="checkbox-radio-option-one" type="checkbox" value="">
        Here's option one.
    </label>

    <label for="checkbox-radio-option-two" class="pure-radio">
        <input id="checkbox-radio-option-two" type="radio" name="optionsRadios" value="option1" checked>
        Here's a radio button. You can choose this one..
    </label>

    <label for="checkbox-radio-option-three" class="pure-radio">
        <input id="checkbox-radio-option-three" type="radio" name="optionsRadios" value="option2">
        ..Or this one!
    </label>
</form>

  

  <pre class="snippet" data-language="html"><code>&lt;form class=&quot;pure-form&quot;&gt;
    &lt;label for=&quot;option-one&quot; class=&quot;pure-checkbox&quot;&gt;
        &lt;input id=&quot;option-one&quot; type=&quot;checkbox&quot; value=&quot;&quot;&gt;
        Here&#x27;s option one.
    &lt;/label&gt;

    &lt;label for=&quot;option-two&quot; class=&quot;pure-radio&quot;&gt;
        &lt;input id=&quot;option-two&quot; type=&quot;radio&quot; name=&quot;optionsRadios&quot; value=&quot;option1&quot; checked&gt;
        Here&#x27;s a radio button. You can choose this one..
    &lt;/label&gt;

    &lt;label for=&quot;option-three&quot; class=&quot;pure-radio&quot;&gt;
        &lt;input id=&quot;option-three&quot; type=&quot;radio&quot; name=&quot;optionsRadios&quot; value=&quot;option2&quot;&gt;
        ..Or this one!
    &lt;/label&gt;
&lt;/form&gt;</code></pre>
</div>


            <div class="legal pure-g-r">
    <div class="pure-u-2-5">
        <div class="l-box">
            <p class="legal-license">
                This site is built with &lt;3 using Pure v0.3.0<br>
                All code on this site is licensed under the <a href="http://yuilibrary.com/license/">BSD License</a> unless stated otherwise.
            </p>
        </div>
    </div>

    <div class="pure-u-1-5">
        <div class="l-box legal-logo">
            <a href="http://yuilibrary.com/">
                <img src="/img/logo-footer.png" height="30" width="65"
                     alt="YUI logo">
            </a>
        </div>
    </div>

    <div class="pure-u-2-5">
        <div class="l-box">
            <ul class="legal-links">
                <li><a href="https://github.com/yui/pure/">GitHub Project</a></li>
                <li><a href="http://yuilibrary.com/security/">Security Contact Info</a></li>
            </ul>

            <p class="legal-copyright">
                &copy; 2013 Yahoo! Inc. All rights reserved.
            </p>
        </div>
    </div>
</div>


        </div>
    </div>

  
  
    <script src="/combo/1.6.3?/js/ui.js&/vendor/rainbow/rainbow-min.js"></script>
  

</body>
</html>
