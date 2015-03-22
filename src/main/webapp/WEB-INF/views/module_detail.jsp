<%@page import="java.util.Set" %>
<%@page import="java.util.List" %>
<%@page import="com.conway.pangpang.domain.Module" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
                 <i class='icon-cog'></i>
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
		<h4><a href="/pangpang/module"><span class=" icon-chevron-sign-left"></span> Go back</a></h4>
	</div>
</div>

<div class='row-fluid'>
<div class='span12 box'>
<div class='box-content'>
   <div class="title"><h4><span>SHOW ITEM DETAILS WHERE</span></h4><br/></div>
   <form:form method="post" modelAttribute="module" class="form form-horizontal" style="margin-bottom: 0;">
   	   <div style="margin:0;padding:0;display:inline">
   	   	   <form:input path="moduleId" type="hidden"/>
   	   </div>
       <div class='control-group'>
           <form:label class='control-label' path='moduleName'>Module Name</form:label>
           <div class='controls'>
               <form:input id='moduleName' path="moduleName" class="span6" type='text' value=""/>
           </div>
       </div>
       <div class='control-group'>
           <label class='control-label'>Leaf Module</label>
           <div class='controls'>
               <label class='radio inline'>
                   <form:radiobutton path="LEAF" value='false' checked="checked"/>
                   Menu
               </label>
               <label class='radio inline'>
                   <form:radiobutton path="LEAF" value='true' />
                   Leaf
               </label>
           </div>
       </div>
       <div class='control-group'>
           <form:label class='control-label' path='parentId'>Parent Module</form:label>
           <div class='controls'>
               <form:select path='parentId' items='${moduleList}' itemLabel='moduleName' itemValue='moduleId' class='select2 span6'>
               </form:select>
           </div>
       </div>
       <div class='control-group'>
           <form:label class='control-label' path='URL'>Access URL</form:label>
           <div class='controls'>
               <form:input path="URL" class='span6' placeholder="begin with '/'" type='text'/>
           </div>
       </div>
       <div class='control-group'>
           <label class='control-label' for='select2-icon'>Icon Name</label>
           <div class='controls'>
               <select id='select2-icon' name='icon' class="span6">
                <option value='icon-heart'>icon-heart</option>
                <option value='icon-home'>icon-home</option>
                <option value='icon-resize-full'>icon-resize-full</option>
               </select>
           </div>
       </div>
       <div class='control-group'>
           <form:label class='control-label' path='listOrder'>List Order</form:label>
           <div class='controls'>
               <form:input path="listOrder" placeholder='0 to 9' type='text' class="span6"/>
           </div>
       </div>
       <div class='control-group'>
           <form:label class='control-label' path="status">Module Status</form:label>
           <div class='controls'>
               <label class='radio inline'>
                   <form:radiobutton path="status" value='1' checked="checked"/>
                   Enable
               </label>
               <label class='radio inline'>
                   <form:radiobutton path="status" value='0' />
                   Disable
               </label>
           </div>
       </div>
       <div class='control-group'>
           <form:label class='control-label' path='remark'>Remark</form:label>
           <div class='controls'>
               <form:textarea path='remark' rows='3' class="span8"></form:textarea>
           </div>
       </div>
       <div class='form-actions'>
           <button class='btn btn-primary' type='submit'>
               <i class='icon-save'></i>
               Save
           </button>
           <button class='btn' type='submit'>Cancel</button>
       </div>
   </form:form>
</div>
</div>
</div>

</div>
</div>
</div>
</section>
<%@include file="page_footer.jsp"%>