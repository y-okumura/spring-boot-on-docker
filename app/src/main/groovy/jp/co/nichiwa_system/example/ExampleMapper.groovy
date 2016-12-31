package jp.co.nichiwa_system.example

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Select

@Mapper
interface ExampleMapper {
  @Select('select sysdate()')
  Date sysdate();
}
