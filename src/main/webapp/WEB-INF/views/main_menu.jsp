<script type="text/javascript">
$(document).ready(function(){
	var mainMenu = <%=session.getAttribute("main_menu")%>;
	var menuHtml = "";
	menuHtml = buildMenuHtml(menuHtml, mainMenu);
	$("div.navigation").append(menuHtml);
});

function buildMenuHtml(menuHtml, mainMenu){
	menuHtml = menuHtml + "<ul class='nav nav-stacked'>";
	for(var i=0; i<mainMenu.length; i++){
		if(mainMenu[i].leaf){
			menuHtml = menuHtml + "<li class=''><a href='" + mainMenu[i].url+"'>";
			menuHtml = menuHtml + "<i class='"+mainMenu[i].icon+"'></i>";
			menuHtml = menuHtml + "<span>"+mainMenu[i].moduleName+"</span></a></li>";
		}else{
			menuHtml = menuHtml + "<li class=''><a class='dropdown-collapse' href='#'>";
			menuHtml = menuHtml + "<i class='"+mainMenu[i].icon+"'></i>";
			menuHtml = menuHtml + "<span>"+mainMenu[i].moduleName+"</span><i class='icon-angle-down angle-down'></i></a>";
	
			var childMoudles = mainMenu[i].childModules;
			menuHtml = buildMenuHtml(menuHtml, childMoudles);
		}
	}
	menuHtml = menuHtml + "</ul>";
	return menuHtml;
}
</script>
<nav class='' id='main-nav'>
<div class='navigation'>
<div class='search'>
    <form accept-charset="UTF-8" action="search_results.html" method="get" /><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
        <div class='search-wrapper'>
            <input autocomplete="off" class="search-query" id="q" name="q" placeholder="Search..." type="text" value="" />
            <button class="btn btn-link icon-search" name="button" type="submit"></button>
        </div>
    </form>
</div>

</div>
</nav>