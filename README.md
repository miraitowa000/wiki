# Wiki电商系统

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](#)

## 项目概述

Wiki电商系统是一个基于Spring Boot开发的电子商务平台，提供商品分类、商品管理、用户管理、购物车、订单管理等功能。系统采用前后端分离架构，后端提供RESTful API接口，前端可以通过这些接口获取数据并展示。

## 技术栈

### 后端技术

- **核心框架**：Spring Boot 2.7.5
- **ORM框架**：MyBatis 2.1.3 + MyBatis-Plus 3.3.2
- **数据库**：MySQL 8.0
- **数据库连接池**：Druid 1.1.10
- **缓存**：Redis
- **API文档**：SpringDoc OpenAPI (Swagger) 1.7.0
- **安全认证**：JWT (java-jwt 4.4.0 + jjwt 0.9.1)
- **工具库**：
  - Lombok：简化Java代码
  - Guava：提供限流功能
  - Validation：数据校验

### 开发工具

- **构建工具**：Maven
- **代码生成**：MyBatis Generator 1.4.0

## 功能模块

### 用户模块

- 用户注册
- 用户登录
- 用户信息更新
- 用户订单查询

### 商品分类模块

- 分类列表查询
- 一级分类推荐

### 商品模块

- 商品信息管理
- 商品详情
- 商品图片
- 商品参数
- 商品SKU

### 购物车模块

- 添加商品到购物车
- 购物车商品管理

### 订单模块

- 订单创建
- 订单查询
- 订单项管理

### 其他功能

- 首页轮播图管理
- 文件上传

## 系统架构

系统采用分层架构设计：

- **Controller层**：处理HTTP请求，调用Service层业务逻辑
- **Service层**：实现业务逻辑，调用Mapper层数据访问
- **Mapper层**：数据访问层，与数据库交互
- **Domain层**：实体类，对应数据库表结构
- **DTO/VO层**：数据传输对象和视图对象，用于数据传输和展示

## 安装部署

### 环境要求

- JDK 1.8+
- Maven 3.6+
- MySQL 8.0+
- Redis 5.0+

### 部署步骤

1. **克隆项目**

   ```bash
   git clone [项目Git地址]
   cd wiki
   ```

2. **配置数据库**

   修改 `src/main/resources/config/application.yml` 文件中的数据库连接信息：

   ```yaml
   spring:
     datasource:
       druid:
         url: jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai
         username: [你的数据库用户名]
         password: [你的数据库密码]
   ```

3. **配置Redis**

   修改 `src/main/resources/config/application.yml` 文件中的Redis连接信息：

   ```yaml
   spring:
     data:
       redis:
         host: [Redis服务器地址]
         port: 6379
   ```

4. **编译打包**

   ```bash
   mvn clean package
   ```

5. **运行应用**

   ```bash
   java -jar target/wiki-0.0.1-SNAPSHOT.jar
   ```

6. **访问应用**

   应用启动后，可通过以下地址访问：
   - 应用首页：http://localhost:8081
   - API文档：http://localhost:8081/swagger-ui.html
   - Druid监控：http://localhost:8081/druid (用户名：admin，密码：admin)

## API文档

系统集成了SpringDoc OpenAPI (Swagger)，提供了完整的API文档。启动应用后，可以通过以下地址访问API文档：

http://localhost:8081/swagger-ui.html

## 开发指南

### 代码生成

项目使用MyBatis Generator自动生成数据库表对应的实体类和Mapper。可以通过以下命令生成代码：

```bash
mvn mybatis-generator:generate
```

### 日志配置

项目使用Logback作为日志框架，日志配置文件位于 `src/main/resources/logback-spring.xml`。

## 许可证

本项目采用 MIT 许可证 - 详情请参阅 [LICENSE](LICENSE) 文件

## 📞 联系方式

- 项目维护者：[张宇]
- 电子邮件：[miraitowa0805@gmail.com]

---

⭐️ 如果这个项目对您有帮助，请给它一个星标！
