
   	var url;
      	//添加用户
        function newUser(){
            $('#dlg').dialog('open').dialog('center').dialog('setTitle','添加用户信息');
            $('#fm').form('clear');
            url = 'indexHandle.jsp?flags=add';
        }
        //修改用户
        function editUser(){
            var row = $('#dg').datagrid('getSelected');
            if (row){
                $('#dlg').dialog('open').dialog('center').dialog('setTitle','用户信息修改');
                $('#fm').form('load',row);
                url = 'indexHandle.jsp?flags=amend&uuid='+row.uuid;
            }
        }
        //用户数据的获取于提交
        function saveUser(){
            $('#fm').form('submit',{
                url: url,
                onSubmit: function(){
                    return $(this).form('validate');
                },
                success: function(result){
                    var result = eval('('+result+')');
                    if (result.errorMsg){
                        $.messager.show({
                            title: 'Error',
                            msg: result.errorMsg
                        });
                    } else {
                        $('#dlg').dialog('close');        // close the dialog
                        $('#dg').datagrid('reload');    // reload the user data
                    }
                }
            });
        }
        //删除用户信息
        function destroyUser(){
        	var row =$("#dg").datagrid
            var row = $('#dg').datagrid('getSelected');
            if (row){
                $.messager.confirm('操作确认','你确定要删除此条用户信息吗?',function(r){
                    if (r){
                        $.post('indexHandle.jsp?flags=delete',{uuid:row.uuid},function(result){
                            if (result.success){
                                $('#dg').datagrid('reload');    // reload the user data
                            } else {
                                $.messager.show({    // show error message
                                    title: 'Error',
                                    msg: result.errorMsg
                                });
                            }
                        },'json');
                    }
                });
            }
        }
  