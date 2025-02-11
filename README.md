# 渔龙 - 代码生成器共享平台

> 作者：yulong
>



深入业务场景的企业级硬项目，基于 React + Spring Boot + Picocli + 对象存储的 **代码生成器共享平台** 。

开发者可以在平台上制作并发布代码生成器，用户可以搜索、下载、在线使用代码生成器，管理员可以集中管理所有用户和生成器。

在线体验：[http://yuzi.code-nav.cn](http://yuzi.code-nav.cn/)

视频演示：[https://www.bilibili.com/video/BV1EA4m1L7tm/](https://www.bilibili.com/video/BV1EA4m1L7tm/)

![](https://pic.yupi.icu/1/image-20240130143818360.png)



## 项目简介

该项目很特别，听起来是一个项目，但其实是循序渐进的 **3 个项目** ！

大致学习过程：基于命令行的本地代码生成器、代码生成器制作工具、在线代码生成器平台。



#### 项目展示

主页（代码生成器搜索列表）：

![](https://pic.yupi.icu/1/image%20(12).png)

代码生成器创建页（分步表单）：

![](https://pic.yupi.icu/1/image%20(13).png)

代码生成器创建页（复杂嵌套动态表单）：

![](https://pic.yupi.icu/1/image%20(14).png)

在线上传和制作代码生成器：

![](https://pic.yupi.icu/1/image%20(15).png)

代码生成器详情页：

![](https://pic.yupi.icu/1/image%20(16).png)

在线使用代码生成器：

![](https://pic.yupi.icu/1/image%20(17).png)

因为项目比较庞大，拆分后学习会更轻松；而且不同阶段的难度不同，大家可以根据学习进度和时间独立学习。

> 感兴趣的同学可以 **免费试看** 第一期项目回放：https://www.bilibili.com/video/BV1ie411Q7AV



### 为什么带大家做这个项目？

1）教程资料少：网上虽然有现成的项目模板，但基本都是别人封装好的，只能按作者的要求生成，并且缺少项目教程；而本项目不仅带大家做自己的代码生成器，还会 **进 2 步** 扩展，打造制作自定义代码生成器的工具和平台。

2）新颖且亮眼：别人写代码，而你做生产代码的脚手架、工具和平台来提高研发效能，降维打击。

3）能学到东西：不再是增删改查的项目，而是包含了大量的实际业务场景、系统设计和优化、解决方案。

4）有区分度：区别于传统 Web 应用，项目涉及命令行开发、性能优化、存储优化等实战，给你的简历增加竞争力。

5）有实际应用价值：快速定制属于自己的代码生成器，提高开发效率，还能通过平台协作共建，比如做个祝福网站生成器给大家用。

![](https://pic.yupi.icu/1/image-20240130145956358.png)



### 项目特点

该项目 **选题新颖、业务深入**，不同于泛滥的管理系统、博客商城、只有增删改查的业务系统，本项目会基于 **模板引擎 + 命令行开发 + 多种设计模式 + 元信息设计**，从 0 开始手把手带大家开发功能完备的代码生成器共享平台，并选用 **十几种优化方法**，最终带大家 **部署上线** 项目。

鱼皮 **从 0 到 1 全程直播无剪辑** 地带大家开发完成项目，总视频教程时长超 **40 小时**、文字教程 **15 万多字**！从需求分析、技术选型、项目设计、项目初始化、Demo 编写、前后端开发实现、项目优化、部署上线等，每个环节我都 **从理论到实践** 给大家讲的明明白白、每个细节都不放过！

![](https://pic.yupi.icu/1/image%20(18).png)

![](https://pic.yupi.icu/1/download_image%20(1).png)



### 加入项目学习

欢迎 [点此加入编程导航](https://yuyuanweb.feishu.cn/wiki/SDtMwjR1DituVpkz5MLc3fZLnzb) ，学习大量优质原创项目，享受更多原创资料，开启你的编程起飞之旅~


### 项目收获

鱼皮给大家讲的都是通用的项目开发方法和架构设计套路，从这个项目中你可以学到：

- 如何拆解复杂业务，从 0 开始设计实现系统？
- 如何灵活生成定制化代码？
- 如何开发可交互的命令行工具？
- 如何巧妙利用设计模式来优化代码？
- 如何实现通用的文件上传下载？
- 如何巧用元信息制作代码生成器？
- 如何快速部署上线前后端项目？
- 如何高效开发复杂的前端表单？
- 如何从多个角度分析优化项目？

此外，还能学会很多作图、思考问题、对比方案的方法，提升排查问题、自主解决 Bug 的能力。



### 本项目适合的同学

本项目同时适合前端和后端，是一套完整的全栈项目。

如果你是后端，已经学过 Java Web，可以通过本项目学到复杂业务的系统设计方法、命令行工具的开发、多种设计模式的实战运用、十几种项目优化方法、压力测试、分布式任务调度、快速上线等技能。提升自己的编程和架构设计能力，并给简历增加大量亮点。

如果你是前端，最好已经学习过 Vue 或 React 框架，可以通过本项目学习到快速开发前端项目的工具技巧、复杂前端页面的设计开发、组件的抽象复用、前端项目快速上线等实战经验。



### 技术选型（全栈项目）

#### 前端

- React 18 开发框架
- Ant Design Pro 脚手架（万用前端模板）
- Ant Design 组件库
- ⭐️ Ant Design Procomponents 高级组件
- OpenAPI 代码生成
- 前端工程化：ESLint + Prettier + TypeScript
- ⭐️ 前端通用文件上传下载



#### 后端

- Java Spring Boot 开发框架（万用后端模板）
- MySQL 数据库
- MyBatis-Plus 及 MyBatis X 自动生成
- Maven 自动打包
- ⭐️ Picocli Java 命令行应用开发
- ⭐️ FreeMarker 模板引擎
- ⭐️ Caffeine + Redis 多级缓存
- ⭐️ XXL-JOB 分布式任务调度系统
- ⭐️ 腾讯云 COS 对象存储
- ⭐️ 多种设计模式
    - 命令模式
    - 模板方法模式
    - 双检锁单例模式
- ⭐️ 多角度项目优化
    - 可移植性、健壮性、可扩展性、圈复杂度优化
    - 7 种性能优化思路和实践
    - 7 种存储优化思路和实践
- ⭐️ Vert.x 响应式编程
- ⭐️ JMeter 压力测试
- Hutool 工具库和 Lambda 表达式编程



#### 项目上线

- 轻量应用服务器
- 宝塔 Linux 面板
- Nginx 反向代理



再列举下项目的大纲，只是部分关键环节。此外，直播过程中还讲了很多平时大家自己看视频根本学不到的做项目经验和编码技巧，比如：如何进行系统设计、规范的前后端开发流程、代码抽象复用的小技巧、如何进行系统优化等。



## 项目大纲

这个项目内容非常多，大家可以看看有没有自己想学的知识点。



### 第一章：本地代码生成器

1. 项目介绍 | 项目背景
2. 项目介绍 | 需求分析
3. 项目介绍 | 技术选型
4. 项目介绍 | 项目整体设计
5. 代码生成 | 项目初始化
6. 代码生成 | 实现流程分析
7. 代码生成 | 静态文件生成
8. 代码生成 | FreeMarker 模板引擎入门
9. 代码生成 | FreeMarker 模板引擎实战
10. 代码生成 | 动态文件生成
11. 代码生成 | 动静结合生成
12. 命令行开发 | Java 命令行开发方案
13. 命令行开发 | Picocli 命令行框架入门
14. 命令行开发 | 命令模式
15. 命令行开发 | Picocli 命令行生成器开发



### 第二章：代码生成器制作工具

1. 制作工具开发 | 规划和设计
2. 制作工具开发 | 元信息定义
3. 制作工具开发 | 编码开发（包含程序构建 jar 包）
4. 制作工具优化 | 可移植性优化
5. 制作工具优化 | 功能优化
6. 制作工具优化 | 健壮性优化
7. 制作工具优化 | 圈复杂度优化
8. 制作工具优化 | 可扩展性优化
9. 制作工具优化 | 模板方法模式
10. 配置能力增强 | 需求分析
11. 配置能力增强 | 实现思路
12. 配置能力增强 | 开发实现
13. 模板制作工具 | 需求分析
14. 模板制作工具 | 核心设计
15. 模板制作工具 | 基础功能实现（有状态和无状态）
16. 模板制作工具 | 更多功能实现（文件过滤机制）
17. 模板项目生成 | Bug 修复
18. 模板项目生成 | 参数封装（易用性优化）
19. 模板项目生成 | 制作 Spring Boot 项目模板生成器
20. 模板项目生成 | 测试成果
21. 模板项目生成 | 扩展思路



### 第三章：在线代码生成器共享平台

1. 云平台开发 | 需求分析
2. 云平台开发 | 线上化实现流程
3. 云平台开发 | 数据库表设计
4. 云平台开发 | 后端项目初始化
5. 云平台开发 | 后端代码生成器功能开发
6. 云平台开发 | 前端项目初始化
7. 云平台开发 | 前端用户注册页面
8. 云平台开发 | 前端管理页面
9. 云平台开发 | 主页开发（搜索列表页）
10. 生成器共享 | 需求分析
11. 生成器共享 | 通用文件上传下载（对象存储）
12. 生成器共享 | 创建代码生成器功能
13. 生成器共享 | 前端通用文件上传组件
14. 生成器共享 | 代码生成器详情页面（文件下载）
15. 在线使用生成器 | 需求分析
16. 在线使用生成器 | 核心设计
17. 在线使用生成器 | 后端开发
18. 在线使用生成器 | 前端模型配置功能
19. 在线使用生成器 | 使用代码生成器页面
20. 在线使用生成器 | 扩展思路
21. 在线制作生成器 | 需求分析
22. 在线制作生成器 | 核心设计
23. 在线制作生成器 | 后端开发
24. 在线制作生成器 | 前端文件配置功能
25. 在线制作生成器 | 制作生成器组件



### 第四章：优化及上线

1. 性能优化 | 通用性能优化思路
2. 性能优化 | 核心功能性能优化
3. 性能优化 | 查询性能优化（7 种）
4. 性能优化 | 压力测试
5. 性能优化 | 多级缓存
6. 性能优化 | 请求层优化
7. 性能优化 | Vert.x 反应式编程
8. 性能优化 | Vert.x 核心原理（重要概念）
9. 性能优化 | Vert.x 改造请求
10. 存储优化 | 通用存储优化思路
11. 存储优化 | 存储空间优化
12. 存储优化 | 文件清理机制
13. 存储优化 | 分布式任务调度系统入门
14. 存储优化 | 分布式任务调度系统原理
15. 存储优化 | 存储成本优化
16. 存储优化 | 存储安全性优化
17. 存储优化 | COS 安全管理
18. 存储优化 | 权限管理实践
19. 部署上线 | 服务器初始化
20. 部署上线 | 部署规划
21. 部署上线 | 安装依赖
22. 部署上线 | 前端部署
23. 部署上线 | 后端部署
24. 部署上线 | 测试验证



## 项目资料

> 编程导航的同学点此获取所有资料：https://yuyuanweb.feishu.cn/wiki/JKRZwxx1AixaPnkzSypcLcqOnic



除了项目教程外，鱼皮的实战项目系列还会提供以下服务：

- 详细的直播笔记
- 完整的项目源码
- 答疑解惑
- 专属项目交流群
- ⭐️ 现成的简历写法（**30 多个亮点**，直接写满简历）
- ⭐️ 项目的扩展思路（拉开和其他人的差距）
- ⭐️ 项目相关面试题、题解和真实面经（**近 60 道面试题**，提前准备，面试不懵逼）
- ⭐️ 前端 + Java 后端万用项目模板（快速创建项目）



![](https://pic.yupi.icu/1/image-20240130150736152.png)



## 加入项目学习

欢迎 [点此加入编程导航](https://yuyuanweb.feishu.cn/wiki/SDtMwjR1DituVpkz5MLc3fZLnzb) ，学习大量优质原创项目，享受更多原创资料，开启你的编程起飞之旅~

已经有不少小伙伴学起来了，还有很多大家自发整理的笔记。不得不说，做项目真的给了很多同学一个坚持学习的目标，大家的动力也更足了！冲冲冲！

![](https://pic.yupi.icu/1/image-20240130151151602.png)


更多鱼皮原创项目系列教程：https://yuyuanweb.feishu.cn/wiki/SePYwTc9tipQiCktw7Uc7kujnCd