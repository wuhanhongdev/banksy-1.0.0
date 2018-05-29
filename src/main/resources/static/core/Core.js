var Core = {
    click: function (id, click) {
        $("#" + id).click(function () {
            click();
        });
    },
    ajaxGet: function (url, success) {
        $.ajax({
            url: url,
            type: "GET",
            dataType: "json",
            success: function (e) {
                success(e);
            },
            error: function (e) {
                console.info(e);
            }
        });
    },
    ajaxPost: function (url, data, success) {
        $.ajax({
            url: url,
            type: "post",
            data: data,
            dataType: "json",
            success: function (e) {
                success(e);
            },
            error: function (e) {
                console.info(e);
            }
        });
    },
    loadPage: function (url) {
        $("#pageContent").load(url);
    },
    table: function (id, url, col) {
        $('#' + id).bootstrapTable({
            method: 'post',
            contentType: "application/x-www-form-urlencoded",//必须要有！！！！
            url: url,//要请求数据的文件路径
            height: 450,//高度调整
            //toolbar: '#toolbar',
            striped: true,
            dataField: "res",
            pageNumber: 1, //初始化加载第一页，默认第一页
            pagination: true,//是否分页
            queryParamsType: 'limit',//查询参数组织方式
            //queryParams: queryParams,//请求服务器时所传的参数
            sidePagination: 'server',//指定服务器端分页
            pageSize: 5,//单页记录数
            pageList: [5, 10, 20, 30],//分页步进值
            showRefresh: true,//刷新按钮
            showColumns: true,
            clickToSelect: true,//是否启用点击选中行
            toolbarAlign: 'right',
            buttonsAlign: 'right',//按钮对齐方式
            columns: col,
            locale: 'zh-CN',//中文支持,
            responseHandler: function (res) {
                return res;
            }
        });
    },
    tableRefresh : function(id){
        $('#' + id).bootstrapTable('refresh');
    }
};