## Llama

- python环境，3.10以上
- git安装
- wget下载安装，配置环境变量
- 下载llama示例，`git clone https://github.com/facebookresearch/llama.git`
- 进入llama文件夹，cmd。这一步完成后llama示例项目在本地部署完成
  - `python -v venv venv`
  - `call venv\Scripts\activate.bat`
  - `pip install -e .`

- 进入llama文件夹，打开git bash窗口，`./download.sh`，要求输入下载地址（邮箱里找），选择模型

以上llama2示例不适合个人电脑，下面是mlc程序：

- conda环境，安装Anaconda，配置环境变量
- 管理员身份，运行命令行窗口

```bash
d:
conda create -n mlc-chat-venv -c mlc-ai -c conda-forge mlc-chat-cli-nightly # 创建一次即可
conda activate mlc-chat-venv

conda install git git-lfs
git lfs install

mkdir -p d:\prebuilt
git clone https://github.com/mlc-ai/binary-mlc-llm-libs.git d:\prebuilt\lib

cd prebuilt
git clone https://huggingface.co/mlc-ai/mlc-chat-Llama-2-7b-chat-hf-q4f16_1
# huggingface.io无法下载???
```

- vulkan驱动下载安装

- 安装显卡驱动，`vulkan.org/tools#vulkan-gpu-resources`，下载安装对应的驱动

- 在刚才的命令行中运行

  ```bash
  mlc_chat_cli --local-id D:\prebuilt\mlc-chat-Llama-2-7b-chat-hf-q4f16_1 --artifact-path d:\
  ```
