<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<body>
    <form>
        <table border="1">
            <tr>
                <th>메뉴</th>
                <th>가격</th>
                <th>수량</th>
                <th>합계</th>
            </tr>
            <tr>
                <td>아메리카노</td>
                <td>2500</td>
                <td><input type="text" name="c1" class="c in"></td>
                <td><input type="text" name="c1Price" class="p" readonly></td>
            </tr>
            <tr>
                <td>라떼</td>
                <td>3000</td>
                <td><input type="text" name="c2" class="c in"></td>
                <td><input type="text" name="c2Price" class="p" readonly></td>
            </tr>
            <tr>
                <td>생강라떼</td>
                <td>4500</td>
                <td><input type="text" name="c3" class="c in"></td>
                <td><input type="text" name="c3Price" class="p" readonly></td>
            </tr>
            <tr>
                <td>딸기바나나라떼</td>
                <td>4500</td>
                <td><input type="text" name="c4" class="c in"></td>
                <td><input type="text" name="c4Price" class="p" readonly></td>
            </tr>
            <tr>
                <th>합계</th>
                <th></th>
                <th><input type="text" name="cTotalCnt" id="cTotalCnt" class="c" readonly></th>
                <th><input type="text" name="cTotalPrice" id="cTotalPrice" class="p" readonly></th>
            </tr>
            <tr>
                <td colspan="4">
                    <input type="button" value="계산하기">
                    <input type="reset" >
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
</body>
</html>