# Practice 2 – Kế thừa trong Java

Dự án dùng Java 25 và Spring Boot 4 để minh họa `interface`, `abstract class`, `extends` và `implements`.

## Mối quan hệ

- `CheckCorrect` là interface quy định phương thức kiểm tra đáp án.
- `Question` là abstract class `implements CheckCorrect` và lưu nội dung chung của câu hỏi.
- `YesNoQuestion` và `ChoiceQuestion` là các class `extends Question`; mỗi class tự triển khai `checkCorrect()`.

## Yêu cầu

Docker và Docker Compose đang chạy. Không cần cài Java hoặc Maven trên máy.

## Chạy chương trình

Từ thư mục `practice2`:

```bash
docker compose up --build
```

Kết quả cần thấy:

```text
Java có hỗ trợ interface không?
Đáp án yes đúng? true
2 + 2 bằng bao nhiêu?
Đáp án b đúng? true
```