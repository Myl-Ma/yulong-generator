package com.myl.cli.example; // 声明包名

// 导入 picocli 相关的类
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/**
 *  定义一个命令行程序 "ASCIIArt"
 *  - @Command 这个注解用于声明一个 Picocli 的命令
 *  - name = "ASCIIArt" ：指定 CLI 程序的名称
 *  - version = "ASCIIArt 1.0" ：指定版本号
 *  - mixinStandardHelpOptions = true ：支持 `-h/--help` 和 `-V/--version` 选项
 */
@Command(name = "ASCIIArt", version = "ASCIIArt 1.0", mixinStandardHelpOptions = true)
public class ASCIIArt implements Runnable { // 实现 Runnable，使其可以在 CommandLine 执行时调用 run()

    /**
     * 定义一个 `-s` 或 `--font-size` 选项
     * - `@Option` 注解表示这个字段是一个可选参数
     * - `names = { "-s", "--font-size" }` 表示可以用 `-s` 或 `--font-size` 指定字体大小
     * - `description = "Font size"` 说明参数的用途
     * - `int fontSize = 19` 默认值是 `19`
     *
     * 例如：
     *  - `java ASCIIArt -s 24`  -> fontSize = 24
     *  - `java ASCIIArt`（未提供参数） -> fontSize = 19
     */
    @Option(names = { "-s", "--font-size" }, description = "Font size")
    int fontSize = 19;

    /**
     * 定义一个 **位置参数**（不需要 `-` 或 `--` 作为前缀）
     * - `@Parameters` 注解表示这个字段是一个 **位置参数**
     * - `paramLabel = "<word>"` 让帮助文档显示 `<word>` 作为提示
     * - `defaultValue = "Hello, picocli"` 默认值是 `Hello, picocli`
     * - `description = "Words to be translated into ASCII art."` 说明参数用途
     * - `private String[] words = { "Hello,", "picocli" }` 默认值是 `"Hello, picocli"`
     *
     * 例如：
     *  - `java ASCIIArt Hi There`  -> words = ["Hi", "There"]
     *  - `java ASCIIArt`  -> words = ["Hello,", "picocli"]
     */
    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli",
            description = "Words to be translated into ASCII art.")
    private String[] words = { "Hello,", "picocli" };

    /**
     * 这个方法在 `CommandLine.execute()` 被调用时执行
     * - 主要作用是打印 `fontSize` 和 `words`
     */
    @Override
    public void run() {
        // 打印 fontSize
        System.out.println("fontSize = " + fontSize);

        // 把 words 数组转换成逗号分隔的字符串，并打印
        System.out.println("words = " + String.join(",", words));
    }

    /**
     *  `main` 方法是程序入口
     *  - 它创建 `CommandLine` 实例，并执行 `execute(args)`
     *  - `execute(args)` 解析命令行参数，并调用 `run()` 方法
     *  - `exitCode` 返回执行结果（成功 `0`，失败 `1` ）
     *  - `System.exit(exitCode)` 终止程序，并返回 `exitCode`
     */
    public static void main(String[] args) {
        // 创建 CommandLine 实例，并执行命令
        int exitCode = new CommandLine(new ASCIIArt()).execute(args);

        // 终止程序，返回执行状态码
        System.exit(exitCode);
    }
}
