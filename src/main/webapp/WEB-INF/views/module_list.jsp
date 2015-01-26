<%@page import="java.util.Set" %>
<%@page import="java.util.List" %>
<%@page import="com.conway.pangpang.domain.Module" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
function displayAllChildModule(moduleId){
	
	var trs = document.getElementsByTagName("tr");
	if(trs && trs.length){
		var needExpand = true;
		for(var i=0; i<trs.length; i++){
			if(trs[i].id.indexOf(moduleId+"_") >= 0){
				if(trs[i].style.display =="" || trs[i].style.display =="table-row"){//document.all?"block":"table-row"
					trs[i].style.display = "none";
					needExpand = false;
				}else{
					trs[i].style.display = "table-row";
					needExpand = true;
				}
			}
		}
		var mainTr = document.getElementById(moduleId);
		if(mainTr){
			var span = mainTr.getElementsByTagName("span");
			if(span && span.length && needExpand){
				span[0].className = "icon-collapse-alt";
			}else if(span && span.length && !needExpand){
				span[0].className = "icon-expand-alt";
			}
		}
	}
}
</script>

<%@include file="page_header.jsp"%>

<section id='content'>
<div class='container-fluid'>
<div class='row-fluid' id='content-wrapper'>
<div class='span12'>

<!-- page title begin -->            
<div class='row-fluid'>
     <div class='span12'>
         <div class='page-header'>
             <h1 class='pull-left'>
                 <span>Module Management</span>
             </h1>
             <div class='pull-right'>
                 <ul class='breadcrumb'>
                     <li><a href="/pangpang/home"><i class='icon-bar-chart'></i></a></li>
                     <li class='separator'><i class='icon-angle-right'></i></li>
                     <li class='active'>Module Management</li>
                 </ul>
             </div>
         </div>
     </div>
</div>
<!-- page title end -->

<div class='row-fluid'>
	<div class="span11 offset1 box">
		<h4><a href="#"><span class="icon-plus"></span> Add module</a></h4>
	</div>
</div>
<div class='row-fluid'>
 	<div class='span12 box'>
 	<form accept-charset="UTF-8" action="#" class="form form-horizontal" method="post" style="margin-bottom: 0;">
	 	<div class='box-content'>
	 	    <div class="title"><h4><span>SHOW ONLY ITEMS WHERE</span></h4><br/></div>
	 		<div class="row-fluid">
	 		<div class="span6">
	 			 <div class='control-group'>
                    <label class='control-label' for='moduleName'>Module Name</label>
                    <div class='controls'>
                        <input id='moduleName' placeholder='Module name' type='text' class="span12"/>
                    </div>
                </div>
                <div class='control-group'>
                    <label class='control-label' for='inputPassword4'>URL Like</label>
                    <div class='controls'>
                        <input id='url' placeholder='URL like' type='text' class="span12"/>
                    </div>
                </div>
	 		</div>
	 		<div class="span6">
			<button class='btn' style='margin-bottom:5px'><i class='icon-filter'></i> Filter</button>
			</div>
		 	</div>
	 	</div>
	 </form>
 	</div>
</div>

<div class='row-fluid'>
<div class='span12 box bordered-box'>
	<div class='box-content box-no-padding'>
		<div class='responsive-table'>
	    <div class='scrollable-area'>
	    <table class='data-table table table-bordered table-striped' style='margin-bottom:0;'>
	     <thead>
         <tr>
             <th>Module Name</th>
             <th>Module Type</th>
             <th>Url</th>
             <th>Status</th>
             <th>Operation</th>
         </tr>
         </thead>
         <tbody>
         <c:forEach items="${moduleList}" var="module">
         <tr id="${module.moduleId}">
         	<td><c:if test="${!module.LEAF}"><span onclick="displayAllChildModule('${module.moduleId}')" class="icon-collapse-alt"></span></c:if>
         		<c:out value="${module.moduleName}"/></td>
         	<td><c:out value="${module.moduleType}"/></td>
         	<td><c:out value="${module.URL}"/></td>
         	<td><c:out value="${module.status}"/></td>
         	<td>
         	 <div class='text-right'>
                 <a class='btn btn-success btn-mini' href='/pangpang/module?opera=update&moduleId=${module.moduleId}'>
                     <i class='icon-ok'></i>
                 </a>
                 <a class='btn btn-danger btn-mini' href='/pangpang/module?opera=remove&moduleId=${module.moduleId }'>
                     <i class='icon-remove'></i>
                 </a>
             </div>
         	</td>
         </tr>
         <c:forEach items="${module.childModules}" var="subMoudle">
         <tr id="${module.moduleId}_${subMoudle.moduleId}">
         	<td>&nbsp;&nbsp;
         	    <c:if test="${!subMoudle.LEAF}"></c:if><small>
         		<c:out value="${subMoudle.moduleName}"/></small></td>
         	<td><c:out value="${subMoudle.moduleType}"/></td>
         	<td><c:out value="${subMoudle.URL}"/></td>
         	<td><c:out value="${subMoudle.status}"/></td>
         	<td>
         	 <div class='text-right'>
                 <a class='btn btn-success btn-mini' href='/pangpang/module?opera=update&moduleId=${subMoudle.moduleId}'>
                     <i class='icon-ok'></i>
                 </a>
                 <a class='btn btn-danger btn-mini' href='/pangpang/module?opera=remove&moduleId=${subMoudle.moduleId }'>
                     <i class='icon-remove'></i>
                 </a>
             </div>
         	</td>
         </tr>
         </c:forEach>
         </c:forEach>
         </tbody>
	    </table>
	    </div>
	    </div>
	</div>
</div>
</div>

</div>
</div>
</div>
</section>
<%@include file="page_footer.jsp"%>