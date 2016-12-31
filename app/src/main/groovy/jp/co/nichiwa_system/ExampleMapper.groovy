package jp.co.nichiwa_system

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Select

@Mapper
interface ExampleMapper {
  @Select('select sysdate()')
  Date sysdate();
}
