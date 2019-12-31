<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>按操作查询产品属性</title>
<link href="/lib/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="/lib/css/style.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div  class="text-center">
	<select>
	<option>勘察</option>
	<option>开通</option>
	<option>业务变更</option>
	<option>资费变更</option>
	</select>
   <input type="text"  id="charName" placeholder="请输入产品属性名称">
   <input type="text"  id="charNum" placeholder="请输入产品属性编码">
   <input type="text"  id="skuName" placeholder="请输入产品名称">
   <input type="text"  id="skuNum" placeholder="请输入产品编码">
   <button type="button" class="btn btn-search">查询</button>
</div>
    <table id="tb" class="table">
      <thead id="show_character_thead"> </thead>
      <tbody id="show_character_body"> </tbody>
    </table>

<script src="/lib/js/jquery-2.1.4.min.js"></script>
<script src="/lib/js/mejs.js"></script>
<script>
  $(function(){
	  
 	 var tr="<tr>"+
         +"<th>所属产品(skuNum)</th>"
	     +"<th>所属产品(skuName)</th>"
		 +"<th>产品名称(charName)</th>"
		 +"<th>产品编码(charNum)</th>"
		 +"<th>类型(charType)</th>"
		 +"<th>默认值(defaultFlag)</th>"
		 +"<th>别名(alias)</th>"
		 +"<th>最大输入字段(maxLength)</th>"
		 +"<th>是否必填(optionalFlag)</th>"
		 +"<th>展示/操作/隐藏(readonly)</th>"
		 +"<th>正则校验(regular)</th>"
		 +"<th>是否BBOSS定义(toBossFlag)</th>"
		 +"<th>操作</th>"
		 +"</tr>";
		 $("#show_character_thead").append(tr);
		 
       $(".btn-search").click(function(){
    	   findCharacterList();
       });
  })
    
    function findCharacterList(){
	  
	  $.ajax({
		    type: "GET",
		    url: "/character/findCharacter?charName="+$("#charName").val()+"&charNum="+$("#charNum").val()
		    		+"&skuName="+$("#skuName").val()+"&skuNum="+$("#skuNum").val(),
		    success: function (result) {
		    	var data=result.data;
		    	
	    		 
	    		 $("#show_character_body").empty();
		    	for(var i=0;i<data.length;i++){
		    		 var tr="<tr>"+
		    		 +"<td>"+data[i].skuNum+"</td>"
		    		 +"<td>"+data[i].skuName+"</td>"
		    		 +"<td>"+data[i].charName+"</td>"
		    		 +"<td>"+data[i].charNum+"</td>"
		    		 +"<td>"+charTypeDefine(data[i].charType)+"</td>"
		    		 +"<td>"+data[i].defaultFlag+"</td>"
		    		 +"<td>"+data[i].alias+"</td>"
		    		 +"<td>"+data[i].maxLength+"</td>"
		    		 +"<td>"+data[i].optionalFlag+"</td>"
		    		 +"<td>"+data[i].readonly+"</td>"
		    		 +"<td>"+data[i].regular+"</td>"
		    		 +"<td>"+data[i].toBossFlag+"</td>"
		    		 +"<td><a href='#' class='edit'>编辑</a><a href='#' class='del'>删除</a></td>"
		    		 +"</tr>";
		    		$("#show_character_body").append(tr);
		    	}
		    	
		    	
		        console.log(result);
		    },
		    error: function (error) {
		        console.log(error);
		    }
		});
  }
  
  function charTypeDefine(type){
	  var flag;
	  switch(type) {
	     case "1":
	    	 flag="下拉框-1";
	        break;
	     case "2":
	    	 flag="输入框-2";
		        break;
	     case "21":
	    	 flag="点击请求数据回填-21";
		        break;
	     case "22":
	    	 flag="点击弹窗展示操作界面-22";
		        break;
	     case "3":
	    	 flag="文本域textarea-3";
		        break;
	     case "4":
	    	 flag="附件上传-4";
		        break;
	     case "5":
	    	 flag="charType is 5-5";
		        break;
	     case "6":
	    	 flag="多选功能-6";
		        break;
	     case "7":
	    	 flag="开关组件-7";
		        break;
	     case "8":
	    	 flag="日期控件-8";
		        break;
	     default:
	    	 flag='--';
	}
	  return flag;
  }
</script>
</body>
</html>
